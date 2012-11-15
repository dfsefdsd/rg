package ${basepackage}.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gm.soa.common.SoaException;
import com.gm.soa.common.vo.PaginationVO;
import com.gm.soa.constants.ErrorCode;
import com.gm.soa.vo.buyinglead.PaginationCondition;


<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   

@Service
public class ${className}ServiceImpl implements ${className}ServiceRemote{
	
	private static Logger logger = LoggerFactory.getLogger(${className}ServiceImpl.class); 
	
    @Autowired
    private ${className}DAO ${classNameFirstLower}DAO;
    
    /**
     * 新增记录
     */
    @Override
    public Long add${className}(${className}VO ${classNameFirstLower}VO,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	try{
	    	Long result=${classNameFirstLower}DAO.add${className}(${classNameFirstLower}VO);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    
    /**
     * 删除记录
     */
    @Override
    public boolean delete${className}ById(long id,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	try{
	    	boolean result=${classNameFirstLower}DAO.delete${className}ById(id);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		}  	
    }
    
    /**
     * 根据id查询记录
     */
    @Override
    public ${className}VO get${className}ById(long id,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	try{
	        ${className}VO result=${classNameFirstLower}DAO.get${className}ById(id);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    
    /**
     * 查询记录
     */
    @Override
    public PaginationVO<${className}VO> getPagination${className}ByParam(<#list table.columns as column>${column.javaType} ${column.columnNameLower},</#list>PaginationCondition pc,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(${column.columnNameLower});
    	</#list>
    	try{
	    	PaginationVO<${className}VO> result=new PaginationVO<${className}VO>();
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        result.setPageNum(pc.getPageNum());
	        result.setPageSize(pc.getPageSize());
	        
	        int total = getTotal${className}ByParam(<#list table.columns as column>${column.columnNameLower}<#if column_has_next>,</#if></#list>,currentCompId,currentContactId,currentUserId);
	        result.setTotal(total);
	
	        result.setMaxPage(total/pc.getPageSize()+(total%pc.getPageSize())>0?1:0);
	        if(total!=0){
	        	List<${className}VO> list=${classNameFirstLower}DAO.get${className}ListByParam(${classNameFirstLower}VO,pc);
	        	result.setItems(list);
	        }
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    /**
     * 查询总数
     */
    @Override
    public int getTotal${className}ByParam(<#list table.columns as column>${column.javaType} ${column.columnNameLower},</#list>Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();
    	<#list table.columns as column>
    	${classNameFirstLower}VO.set${column.columnName}(${column.columnNameLower});
    	</#list>
    	try{
	    	int result=${classNameFirstLower}DAO.getTotal${className}ByParam(${classNameFirstLower}VO);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    
    /**
     * 修改记录
     */
    @Override
    public boolean update${className}ByParam(${className}VO setParam,${className}VO whereParam,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	try{
	    	boolean result=${classNameFirstLower}DAO.update${className}ByParam(setParam,whereParam);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    
    /**
     * 更新记录
     */
    @Override
    public boolean update${className}ById(<#list table.columns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException{
    	${className}VO ${classNameFirstLower}VO=new ${className}VO();  
    	long id=0L;
    	<#list table.columns as column>
    	<#if column.pk>
    	id=${column.columnNameLower};
    	<#else>
    	${classNameFirstLower}VO.set${column.columnName}(${column.columnNameLower});
    	</#if>
    	</#list>
    	
    	try{
	    	boolean result=${classNameFirstLower}DAO.update${className}ById(id,${classNameFirstLower}VO);
	    	return result;
    	}catch (Exception e) {
			if(e instanceof SoaException){
				throw (SoaException)e;
			}else{
				throw new SoaException( ErrorCode.UNKNOWN, e.getMessage());
			}
		} 
    }
    
}