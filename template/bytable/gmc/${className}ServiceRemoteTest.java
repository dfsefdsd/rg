package com.gm.soa.remote.${soaCorePackage};

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   
import junit.framework.Assert;
import org.junit.Test;
import com.gm.soa.common.util.SoaBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.gm.soa.vo.buyinglead.PaginationCondition;
import com.gm.soa.common.vo.PaginationVO;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;


public class ${className}ServiceRemoteTest extends SoaBaseTest { 
    @Autowired
    private ${className}ServiceRemote ${classNameFirstLower}Service;
    /**
     * 新增记录
     */
	@Test
    public void testAdd${className}()throws Exception{
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	Long result=${classNameFirstLower}Service.add${className}(${classNameFirstLower}VO,currentCompId,currentContactId,currentUserId);
    	Assert.assertFalse(result==null);
    }
    /**
     * 删除记录
     */
    @Test
    public void testDelete${className}ById()throws Exception{
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
        long id=0L;
    	boolean result=${classNameFirstLower}Service.delete${className}ById(id,currentCompId,currentContactId,currentUserId);
    	Assert.assertFalse(result);
    }
    
    /**
     * 根据id查询记录
     */
    @Test
    public void testGet${className}ById()throws Exception{
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	long id=0L;
    	${className}VO result=${classNameFirstLower}Service.get${className}ById(id,currentCompId,currentContactId,currentUserId);
     	Assert.assertFalse(result==null);
    }
    
    /**
     * 查询记录
     */
    @Test
    public void testGetPagination${className}ByParam()throws Exception{
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
    	PaginationCondition pc=new PaginationCondition();
    	pc.setPageNum(1);
    	pc.setPageSize(1);
   	
    	<#list table.columns as column>
    	${column.javaType} ${column.columnNameLower}=null;
    	</#list>
    	
    	PaginationVO<${className}VO> result=${classNameFirstLower}Service.getPagination${className}ByParam(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,pc,currentCompId,currentContactId,currentUserId);
     	Assert.assertFalse(result.getTotal()==0);
    	
    }
    /**
     * 查询总数
     */
    @Test
    public void testGetTotal${className}ByParam()throws Exception{
    	
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
    	<#list table.columns as column>
    	${column.javaType} ${column.columnNameLower}=null;
    	</#list>
    	
    	int result=${classNameFirstLower}Service.getTotal${className}ByParam(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    	Assert.assertFalse(result==0);
    }
    
    /**
     * 修改记录
     */
    @Test
    public void testUpdate${className}ByParam()throws Exception{
    	
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
    	${className}VO setParam=new ${className}VO();
    	${className}VO whereParam=new ${className}VO();
    	boolean result=${classNameFirstLower}Service.update${className}ByParam(setParam,whereParam,currentCompId,currentContactId,currentUserId);
    	Assert.assertFalse(!result);
    }
    
    /**
     * 更新记录
     */
    @Test
    public void testUpdate${className}ById()throws Exception{
    	
    	Long currentCompId=0L;
    	Long currentContactId=0L;
    	Long currentUserId=0L;
    	
    	long id=0L;
    	<#list table.columns as column>
    	${column.javaType} ${column.columnNameLower}=null;
    	</#list>
    	boolean result=${classNameFirstLower}Service.update${className}ById(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    	Assert.assertFalse(!result);
    }
    
}