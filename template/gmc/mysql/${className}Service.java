package finance.datainit.service;

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import finance.datainit.util.CommonUtil;
import finance.datainit.vo.PaginationVO;
import finance.datainit.util.PaginationCondition;
import finance.datainit.vo.${className}VO;
import finance.datainit.dao.${className}DAO;


@Service
public class ${className}Service implements ${className}ServiceRemote{
	
	private static Logger logger = LoggerFactory.getLogger(${className}Service.class); 
	
    @Autowired
    private ${className}DAO ${classNameFirstLower}DAO;
    <#if gh.fromTable>
    /**
     * 新增记录
     */
    @Override
    public boolean add${className}(${className}VO ${classNameFirstLower}VO)throws Exception{
    	
    	try{
	    	return ${classNameFirstLower}DAO.add${className}(${classNameFirstLower}VO);
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		} 
    }
    
    /**
     * 删除记录
     */
    @Override
    public boolean delete${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>)throws Exception{
    	
    	try{
	    	boolean result=${classNameFirstLower}DAO.delete${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>);
	    	logger.info("End function : delete${className}ById");
	    	return result;
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		}  	
    }
    
    /**
     * 更新记录
     */
    @Override
    public boolean update${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception{
    	
    	Map<String,Object> ${classNameFirstLower}VO=new HashMap<String,Object>();  
    	<#list table.updateColumns as column>
    	${classNameFirstLower}VO.put("${column.columnNameLower}",${column.columnNameLower});
    	</#list>
    	
    	try{
	    	boolean result=${classNameFirstLower}DAO.update${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>,${classNameFirstLower}VO);
	    	logger.info("End function : update${className}ById");
	    	return result;
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		} 
    }
    </#if>
    
    /**
     * 根据id查询记录
     */
    @Override
    public ${className}VO get${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception{
    	
    	try{
	        ${className}VO result=${classNameFirstLower}DAO.get${className}ById(<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>);
	        logger.info("End function : get${className}ById");
	    	return result;
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		} 
    }
    
    /**
     * 查询记录
     */
    @Override
    public PaginationVO<${className}VO> getPagination${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>PaginationCondition pc)throws Exception{
    	
    	Map<String,Object> ${classNameFirstLower}VO=new HashMap<String,Object>();  
    	<#list table.queryColumns as column>
    	${classNameFirstLower}VO.put("${column.columnNameLower}",${column.columnNameLower});
    	</#list>
    	try{
	    	PaginationVO<${className}VO> result=new PaginationVO<${className}VO>();
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        result.setPageNum(pc.getPageNum());
	        result.setPageSize(pc.getPageSize());
	        
	        int total = getTotal${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>);
	        result.setTotal(total);
	
	        result.setMaxPage(CommonUtil.getMaxPage(total,pc.getPageSize()));
	        if(total!=0){
	        	List<${className}VO> list=${classNameFirstLower}DAO.get${className}ListByParam(${classNameFirstLower}VO,pc);
	        	result.setItems(list);
	        }
	        logger.info("End function : getPagination${className}ByParam");
	    	return result;
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		} 
    }
    /**
     * 查询总数
     */
    @Override
    public int getTotal${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception{
    	

    	Map<String,Object> ${classNameFirstLower}VO=new HashMap<String,Object>();  
    	<#list table.queryColumns as column>
    	${classNameFirstLower}VO.put("${column.columnNameLower}",${column.columnNameLower});
    	</#list>
    	try{
	    	int result=${classNameFirstLower}DAO.getTotal${className}ByParam(${classNameFirstLower}VO);
	    	logger.info("End function : getTotal${className}ByParam");
	    	return result;
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		throw e;
		} 
    }
}