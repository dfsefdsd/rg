package ${basepackage}.controller;

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

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

<#assign classNameLowerCase= table.classNameLowerCase>  
@GmAutowired
@Controller("${basepackage}.${classNameLowerCase}controller")
public class ${className}Controller extends GmPortalController {
	
	private ${className}Service ${classNameFirstLower}Service;
	
	/**
     * 新增记录
     */
	@RequestMapping 
    public ModelAndView add${className}(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.add${className}(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		result=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    
    /**
     * 删除记录
     */
    public ModelAndView delete${className}ById(long id){
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.delete${className}ById(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		result=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    
    /**
     * 根据id查询记录
     */
    public ModelAndView show${className}ById(long id){
    	ModelAndView result = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		${className}VO vo=${classNameFirstLower}Service.get${className}ById(id,currentCompId,currentContactId,currentUserId);
    		result=new ModelAndView();
			result.setViewName("${basepackage}.${classNameLowerCase}.data");	
    		result.addObject("${classNameFirstLower}", vo);
    		
    	}catch (Exception e) {
			e.printStackTrace();
			result = new GmModelAndView(MessageManagementHelper.MVO_ERROR_PAGE);
            result.addObject("exception", e);
		}
    	return result;
    }
    
	@RequestMapping
	public ModelAndView enter${className}(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,int pageNum){
		ModelAndView result = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		result=new ModelAndView();
			result.setViewName("${basepackage}.${classNameLowerCase}.page");	
			
			<#list table.columns as column>
			result.addObject("${column.columnNameLower}",${column.columnNameLower});
	    	</#list>
    		
    	}catch (Exception e) {
			e.printStackTrace();
			result = new GmModelAndView(MessageManagementHelper.MVO_ERROR_PAGE);
            result.addObject("exception", e);
		}
    	return result;
	}
    
    /**
     * 查询记录
     */
    @RequestMapping
    public ModelAndView query${className}List(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,int pageNum){
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
			
    		jsonMap=${classNameFirstLower}Service.getPagination${className}ByParam(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>pc,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		result=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    /**
     * 查询总数
     */
	@RequestMapping
    public ModelAndView queryTotal${className}ByParam(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	PaginationCondition pc=new PaginationCondition();
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.getTotal${className}ByParam(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		result=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
    
    /**
     * 更新记录
     */
	@RequestMapping 
    public ModelAndView update${className}ById(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	ModelAndView result = null;
    	Map<String, Object> jsonMap = null;
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		jsonMap=${classNameFirstLower}Service.update${className}ById(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
    	}catch (Exception e) {
    		result=new HashMap<String, Object>();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	return result;
    }
}