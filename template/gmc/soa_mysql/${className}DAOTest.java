package com.gm.soa.dao.${soaCorePackage};

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   
import junit.framework.Assert;
import org.junit.Test;
import com.gm.soa.common.util.SoaBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.gm.soa.vo.common.PaginationCondition;
import com.gm.soa.common.vo.PaginationVO;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;
import com.gm.soa.dao.${soaSrcPackage}.${className}DAO;
import java.util.List;

public class ${className}DAOTest extends SoaBaseTest { 
    @Autowired
    private ${className}DAO ${classNameFirstLower}DAO;
    <#if gh.fromTable>
    /**
     * 新增记录
     */
	@Test
    public void testAdd${className}()throws Exception{
	
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(null);
    	</#list>
    	
    	Long result=${classNameFirstLower}DAO.add${className}(${classNameFirstLower}VO);
    	Assert.assertFalse(result==null);
    }
    /**
     * 删除记录
     */
    @Test
    public void testDelete${className}ById()throws Exception{	
        long id=0L;
    	boolean result=${classNameFirstLower}DAO.delete${className}ById(id);
    	Assert.assertFalse(result);
    }
    
    /**
     * 更新记录
     */
    @Test
    public void testUpdate${className}ById()throws Exception{

    	long id=0L;
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(null);
    	</#list>
    	boolean result=${classNameFirstLower}DAO.update${className}ById(id,${classNameFirstLower}VO);
    	Assert.assertFalse(!result);
    }
    </#if>
    /**
     * 根据id查询记录
     */
    @Test
    public void testGet${className}ById()throws Exception{
    	long id=0L;
    	${className}VO result=${classNameFirstLower}DAO.get${className}ById(id);
     	Assert.assertFalse(result==null);
    }
    
    /**
     * 查询记录
     */
    @Test
    public void testGet${className}ListByParam()throws Exception{
    	
    	PaginationCondition pc=new PaginationCondition();
    	pc.setPageNum(1);
    	pc.setPageSize(1);
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(null);
    	</#list>
    	List<${className}VO> result=${classNameFirstLower}DAO.get${className}ListByParam(${classNameFirstLower}VO,pc);
     	Assert.assertFalse(result.size()==0);
    	
    }
    /**
     * 查询总数
     */
    @Test
    public void testGetTotal${className}ByParam()throws Exception{
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(null);
    	</#list>
    	int result=${classNameFirstLower}DAO.getTotal${className}ByParam(${classNameFirstLower}VO);
    	Assert.assertFalse(result==0);
    }
}