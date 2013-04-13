package com.gm.gmportal.mygm.${mvoPackage}.controller;
<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

<#assign classNameLowerCase= table.classNameLowerCase>  
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gm.soa.common.vo.PaginationVO;

import com.gm.gmcommon.pojo.account.AccContacts;
import com.gm.gmcore.annotation.GmAutowired;
import com.gm.gmcore.web.exception.GmUserNotLoginException;
import com.gm.gmcore.web.view.GmModelAndView;
import com.gm.gmportal.core.controller.GmPortalController;
import com.gm.gmportal.mygm.common.constants.CommonConstants;
import com.gm.soa.vo.common.PaginationCondition;
import com.gm.gmportal.mygm.common.constants.CommonConstants;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;
import com.gm.gmportal.mygm.${mvoPackage}.service.${className}Service;

@GmAutowired
@Controller("mygm.${mvoPackage}.${classNameLowerCase}controller")
public class ${className}Controller extends GmPortalController {
	
	private ${className}Service ${classNameFirstLower}Service;
    <#if gh.fromTable>
	/**
     * 新增记录
     */
	@RequestMapping 
    public ModelAndView add${className}(<#list table.notPkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>){
    	
    	logger.info("In function : add${className}: <#list table.notPkColumns as column>${column.columnNameLower}={}<#if column_has_next>,</#if></#list>", new Object[]{<#list table.notPkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>});
    	
    	ModelAndView result = null;
    	Map<String, Object> jsonMap=new HashMap<String, Object>();
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();

    		Long id=${classNameFirstLower}Service.add${className}(<#list table.notPkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
	    	if(id==null){
	    		jsonMap.put(CommonConstants.STATUS,CommonConstants.FAIL);
	    	}else{
	    		jsonMap.put(CommonConstants.STATUS,CommonConstants.SUCCESS);
	    		jsonMap.put(CommonConstants.DATA,id);
	    	}
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
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
    	Map<String, Object> jsonMap = new HashMap<String, Object>();
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		boolean success=${classNameFirstLower}Service.delete${className}ById(<#list table.pkColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		
        	if(!success){
        		jsonMap.put(CommonConstants.STATUS,CommonConstants.FAIL);
        	}else{
        		jsonMap.put(CommonConstants.STATUS,CommonConstants.SUCCESS);
        	}
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
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
    	Map<String, Object> jsonMap = jsonMap=new HashMap<String, Object>();
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		boolean success=${classNameFirstLower}Service.update${className}ById(<#list table.pkColumns as column>${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId); 	
        	if(!success){
        		jsonMap.put(CommonConstants.STATUS,CommonConstants.FAIL);
        	}else{
        		jsonMap.put(CommonConstants.STATUS,CommonConstants.SUCCESS);
        	}
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
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
			result = new GmModelAndView(CommonConstants.MVO_ERROR_PAGE);
            result.addObject(CommonConstants.EXCEPTION, e);
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
			result = new GmModelAndView(CommonConstants.MVO_ERROR_PAGE);
            result.addObject(CommonConstants.EXCEPTION, e);
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
    	Map<String, Object> jsonMap = new HashMap<String, Object>();
    	PaginationCondition pc =new PaginationCondition();
		pc.setPageSize(CommonConstants.DEFAULT_PAGE_SIZE);
		pc.setPageNum(pageNum);
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
			PaginationVO<${className}VO> vos=${classNameFirstLower}Service.getPagination${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,pc,currentCompId,currentContactId,currentUserId);
    		
			jsonMap.put(CommonConstants.STATUS,CommonConstants.SUCCESS);
        	
        	if(vos.getTotal()==0){
        		jsonMap.put(CommonConstants.TOTAL,0);
        	}else{
        		Map<String, Object> adata=null;
        		List<Map<String, Object>> list =new ArrayList<Map<String, Object>>();
        		if(vos.getItems()==null){
        			jsonMap.put(CommonConstants.DATA,null);
        		}else{
        		    for(${className}VO vo:vos.getItems()){
        		    	adata = new HashMap<String, Object>();
        		    	  
        		    	<#list table.columns as column>
        		    	<#if column.javaType=="Date">
        		    	adata.put("${column.columnNameLower}",DateUtil.formatDate(vo.get${column.columnName}(), DateUtil.SIMPLE_DATE_FORMAT));
        		    	<#else>
        		    	adata.put("${column.columnNameLower}",vo.get${column.columnName}());
        		    	</#if>
        		    	</#list>
        		    	
        		    	list.add(adata);
        		    }
        		    jsonMap.put(CommonConstants.DATA,list);
        		}
        	}
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
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
    	Map<String, Object> jsonMap = new HashMap<String, Object>();
    	try{
			AccContacts accContacts = null;	
			accContacts = getCurrentUser().getAccContact();
			Long currentCompId = accContacts.getCompId();
			Long currentContactId = accContacts.getContactId();
			Long currentUserId=accContacts.getUserId();
			
    		int total=${classNameFirstLower}Service.getTotal${className}ByParam(<#list table.queryColumns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.SUCCESS);
    		jsonMap.put(CommonConstants.DATA,total);	
    	}catch (Exception e) {
    		logger.info(" ckpt1 exception:{}", new Object[] { e });
    		e.printStackTrace();
    		jsonMap.put(CommonConstants.STATUS,CommonConstants.ERROR);
		}
    	
    	result=new GmModelAndView(GM_JSON_VIEW, jsonMap);
    	logger.info("End function : queryTotal${className}ByParam");
    	return result;
    }
}