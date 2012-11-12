package ${basepackage}.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.gm.soa.constants.MessageConstants;
import com.gm.soa.dao.BaseDao;
import com.gm.soa.util.StringUtil;
import com.gm.soa.vo.message.ImMessageVO;

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  
public class ${className}DAO {
	
	private static Logger logger = LoggerFactory.getLogger(${className}DAO.class); 
    @Autowired
    private BaseDao baseDao;
    
    /**
     * 获取新的id
     */
    private Long getNew${className}Id(){
        StringBuilder sql = new StringBuilder("SELECT gm_portal.sq_im${gh.lower(table.sqlName)}.nextval FROM DUAL");
        Long result = baseDao.jdbcTemplate.queryForLong(sql.toString());
        return result;
    }
    /**
     * 新增${className}记录
     */
    public Long add${className}(${className}VO ${classNameFirstLower}VO){
    	
        logger.debug("In function : add${className} ${classNameFirstLower}VO={}", new Object[]{${className}VO.toString()});
        
        StringBuilder sql = new StringBuilder();
        Long id = this.getNew${className}Id();
        
    	<#list table.columns as column>
    	<#if column.pk>
    	${className}VO.set${column.columnName}(id);
    	</#if>
    	</#list>
    	
        sql.append("INSERT INTO ${gh.lower(table.sqlName)}(<#list table.columns as column>${gh.lower(column.sqlName)}<#if column_has_next>,</#if></#list>)");
        sql.append(" VALUES (<#list table.columns as column>:${column.columnNameLower}<#if column_has_next>,</#if></#list>)");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        
    	<#list table.columns as column>
    	paramMap.put("${column.columnNameLower}", ${classNameFirstLower}VO.get${column.columnName}());
    	</#list>

        logger.debug(" About to execute sql={} paramMap={}", new Object[]{sql.toString(), paramMap.toString()});
        
        baseDao.namedParameterJdbcTemplate.update(sql.toString(), paramMap);

        logger.debug("End function : add${className}");
        return id;
    }
    /**
     * 删除${className}记录
     */
    public boolean delete${className}ById(long id){
    	
        logger.debug("In function : delete${className}ById id={}", new Object[]{id});
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM ${gh.lower(table.sqlName)} WHERE <#list table.columns as column><#if column.pk>${gh.lower(column.sqlName)}=:id</#if></#list>");
    
        Map<String, Object> paramMap = new HashMap<String, Object>();

    	paramMap.put("id", id);
        logger.debug(" About to execute sql={} paramMap={}", new Object[]{sql.toString(), paramMap.toString()});
        
        boolean result=baseDao.namedParameterJdbcTemplate.update(sql.toString(), paramMap)>0?true:false;

        logger.debug("End function : delete${className}ById");
        return result;
    }
    
    /**
     * 根据id查询${className}记录
     */
    public ${className}VO get${className}ById(long id){
    	
        logger.debug("In function : get${className}ById: id={}", new Object[]{id});
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT <#list table.columns as column>${gh.lower(column.sqlName)}<#if column_has_next>,</#if></#list> FROM ${gh.lower(table.sqlName)} WHERE 1=1 ");
        sql.append(" AND <#list table.columns as column><#if column.pk>${gh.lower(column.sqlName)}=:id</#if></#list>");
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("id", id);
        
        logger.debug(" About to execute sql={} paramMap={}", new Object[]{sql.toString(), paramMap.toString()});
        ${className}VO result = baseDao.namedParameterJdbcTemplate.queryForObject(sql.toString(), paramMap, new BeanPropertyRowMapper<${className}VO>(${className}VO.class));   
        logger.debug("End function : get${className}ById");
        return id;
    }
    
    /**
     * 根据id查询${className}记录
     */
    public ${className}VO get${className}ByParam(${className}VO ${classNameFirstLower}VO){
    	
        logger.debug("In function : get${className}ByParam: ${classNameFirstLower}VO={}", new Object[]{${className}VO.toString()});
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT <#list table.columns as column>${gh.lower(column.sqlName)}<#if column_has_next>,</#if></#list> FROM ${gh.lower(table.sqlName)} WHERE 1=1 ");
        
        if(${classNameFirstLower}VO!=null){
        	Map<String, Object> paramMap = new HashMap<String, Object>();   
        	<#list table.columns as column>
	        if(StringUtil.isNotEmpty(${classNameFirstLower}VO.get${column.columnName}())){
	            sql.append("   AND ${gh.lower(column.sqlName)}=:${column.columnNameLower} ");
	            paramMap.put("${column.columnNameLower}",${classNameFirstLower}VO.get${column.columnName}());
	        }
        	</#list>
        }else{
        	throw new InvalidParameterException();
        }
    	
        logger.debug(" About to execute sql={} paramMap={}", new Object[]{sql.toString(), paramMap.toString()});
        List<${className}VO> result = baseDao.namedParameterJdbcTemplate.query(sql.toString(), paramMap, new BeanPropertyRowMapper<${className}VO>(${className}VO.class));   
        logger.debug("End function : get${className}ByParam");
        return result;
    }
    
}