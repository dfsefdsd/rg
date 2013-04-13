package com.gm.gmportal.mygm.${mvoPackage}.service.impl;

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gm.gmcore.annotation.GmAutowired;
import com.gm.soa.common.util.DateUtil;
import com.gm.soa.common.vo.PaginationVO;
import com.gm.soa.vo.common.PaginationCondition;
import com.gm.gmportal.mygm.common.constants.CommonConstants;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;
import com.gm.soa.remote.${soaCorePackage}.${className}ServiceRemote;
import com.gm.gmportal.mygm.${mvoPackage}.service.${className}Service;


@Service
@GmAutowired
public class ${className}ServiceImpl implements ${className}Service{
	
	private static Logger logger = LoggerFactory.getLogger(${className}ServiceImpl.class); 

    private ${className}ServiceRemote ${classNameFirstLower}ServiceClient;
    
    <#if gh.fromTable>
    /**
     * 新增记录
     */
    public Long add${className}(<#list table.notPkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	
    	logger.debug("In function : add${className}: <#list table.notPkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>,currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.notPkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId});
    	
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	
    	<#list table.notPkColumns as column>
    	${classNameFirstLower}VO.set${column.columnName}(${column.columnNameLower});
    	</#list>
    	Long id=${classNameFirstLower}ServiceClient.add${className}(${classNameFirstLower}VO,currentCompId,currentContactId,currentUserId);
    	logger.debug("End function : add${className}");
    	return id;
    }
    
    /**
     * 删除记录
     */
    public boolean delete${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>,Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	logger.debug("In function : delete${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}</#list>, currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}</#list>,currentCompId,currentContactId,currentUserId});
    	boolean result=${classNameFirstLower}ServiceClient.delete${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>,currentCompId,currentContactId,currentUserId);
    	logger.debug("End function : delete${className}ById");
    	return result;
    }
    
    /**
     * 更新记录
     */
    public boolean update${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	logger.debug("In function : update${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}</#list>,<#list table.updateColumns as column>${column.columnNameLower}={},<#if column_has_next>,</#if></#list>,currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId});

    	boolean result=${classNameFirstLower}ServiceClient.update${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);

    	logger.debug("End function : update${className}ById");
    	return result;
    }
    </#if>
    
    /**
     * 根据id查询记录
     */
    public ${className}VO get${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	logger.debug("In function : get${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>, currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId});
    	${className}VO vo=${classNameFirstLower}ServiceClient.get${className}ById(<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    	logger.debug("End function : get${className}ById");
    	return vo;
    }
    
    /**
     * 查询记录
     */
    public PaginationVO<${className}VO> getPagination${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>PaginationCondition pc,Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	logger.debug("In function : getPagination${className}ByParam: <#list table.queryColumns as column>${column.columnNameLower}={},</#list>pc={}, currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.queryColumns as column>${column.columnNameLower},</#list>pc,currentCompId,currentContactId,currentUserId});
    	PaginationVO<${className}VO> result=${classNameFirstLower}ServiceClient.getPagination${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower},</#list>pc,currentCompId,currentContactId,currentUserId);
    	logger.debug("End function : getPagination${className}ByParam");
    	return result;
    }
    /**
     * 查询总数
     */
    public int getTotal${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>Long currentCompId,Long currentContactId,Long currentUserId)throws Exception{
    	logger.debug("In function : getTotal${className}ByParam: <#list table.queryColumns as column>${column.columnNameLower}={},</#list>currentCompId={},currentContactId={},currentUserId={}", new Object[]{<#list table.queryColumns as column>${column.columnNameLower},</#list>currentCompId,currentContactId,currentUserId});
    	int result=${classNameFirstLower}ServiceClient.getTotal${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower},</#list>currentCompId,currentContactId,currentUserId);
    	logger.debug("End function : getTotal${className}ByParam");
    	return result;
    }
}