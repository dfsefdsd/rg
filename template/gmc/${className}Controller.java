package com.gm.gmportal.mygm.${mvoPackage}.controller;
<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

<#assign classNameLowerCase= table.classNameLowerCase>  
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gm.gmcommon.pojo.account.AccContacts;
import com.gm.gmcore.annotation.GmAutowired;
import com.gm.gmcore.web.exception.GmUserNotLoginException;
import com.gm.gmcore.web.view.GmModelAndView;
import com.gm.gmportal.core.controller.GmPortalController;
import com.gm.gmportal.mygm.common.helper.MessageManagementHelper;
import com.gm.soa.vo.buyinglead.PaginationCondition;
import com.gm.gmportal.mygm.common.constants.CommonConstants;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;
import com.gm.gmportal.mygm.${mvoPackage}.service.${className}VOService;

@GmAutowired
@Controller("mygm.${mvoPackage}.${classNameLowerCase}controller")
public class ${className}Controller extends GmPortalController {
	
	private ${className}VOService ${classNameFirstLower}Service;
    <#if gh.fromTable>
	/**
     * 新增记录
     */
	@RequestMapping 
    public ModelAndView add${className}(<#list table.notPkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	
    	logger.info("In function : add${className}: <#list table.notPkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>", new Object[]{<#list table.notPkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>});
    	
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.add${className}(<#list table.notPkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	logger.info("End function : add${className}");
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    
    /**
     * 删除记录
     */
    @RequestMapping 
    public ModelAndView delete${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	logger.info("In function : delete${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>});
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.delete${className}ById(<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	logger.info("End function : delete${className}ById");
    	return result;
    }
    
    /**
     * 更新记录
     */
	@RequestMapping 
    public ModelAndView update${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	logger.info("In function : update${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}</#list>,<#list table.updateColumns as column>${column.columnNameLower}={},<#if column_has_next>,</#if></#list>,", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.columnNameLower},<#if column_has_next>,</#if></#list>});
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.update${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	logger.info("End function : update${className}ById");
    	return result;
    }
    </#if>
    /**
     * 根据id查询记录
     */
    @RequestMapping 
    public ModelAndView show${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	logger.info("In function : show${className}ById: <#list table.pkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>", new Object[]{<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>});
    	ModelAndView result = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		${className}VO vo=${classNameFirstLower}Service.get${className}ById(<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		result=new ModelAndView();
			result.setViewName("${basepackage}.${classNameLowerCase}.data");	
    		result.addObject("${classNameFirstLower}", vo);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
			result = new GmModelAndView(MessageManagementHelper.MVO_ERROR_PAGE);
            result.addObject("exception", e);
		}
    	logger.info("End function : show${className}ById");
    	return result;
    }
    
	@RequestMapping
	public ModelAndView enter${className}(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,int pageNum){
		logger.info("In function : enter${className}: <#list table.queryColumns as column>${column.columnNameLower}={},</#list>pageNum={}", new Object[]{<#list table.queryColumns as column>${column.columnNameLower},</#list>pageNum});
		ModelAndView result = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		result=new ModelAndView();
			result.setViewName("${basepackage}.${classNameLowerCase}.page");	
			
			<#list table.queryColumns as column>
			result.addObject("${column.columnNameLower}",${column.columnNameLower});
	    	</#list>
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
			result = new GmModelAndView(MessageManagementHelper.MVO_ERROR_PAGE);
            result.addObject("exception", e);
		}
    	logger.info("End function : enter${className}");
    	return result;
	}
    
    /**
     * 查询记录
     */
    @RequestMapping
    public ModelAndView query${className}List(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,int pageNum){
    	logger.info("In function : query${className}List: <#list table.queryColumns as column>${column.columnNameLower}={},</#list>pageNum={}", new Object[]{<#list table.queryColumns as column>${column.columnNameLower},</#list>pageNum});
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	PaginationCondition pc =new PaginationCondition();
		pc.setPageSize(MessageManagementHelper.DEFAULT_PAGE_SIZE);
		pc.setPageNum(pageNum);
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.getPagination${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,pc,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	logger.info("End function : query${className}List");
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    /**
     * 查询总数
     */
	@RequestMapping
    public ModelAndView queryTotal${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	logger.info("In function : getTotal${className}ByParam: <#list table.queryColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>", new Object[]{<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>});
    	PaginationCondition pc=new PaginationCondition();
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.getTotal${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	logger.info("End function : queryTotal${className}ByParam");
    	return result;
    }
}