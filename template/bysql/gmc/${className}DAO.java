package com.gm.soa.dao.${soaSrcPackage};
<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

import com.gm.soa.vo.${soaCorePackage}.${className}VO;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.gm.soa.common.params.PaginationParams;
import com.gm.soa.dao.BaseDao;
import com.gm.soa.util.StringUtil;
import com.gm.soa.vo.buyinglead.PaginationCondition;

@Repository
public class ${className}DAO {
	
	private static Logger logger = LoggerFactory.getLogger(${className}DAO.class); 
    @Autowired
    private BaseDao baseDao;

    private void putWhereParam(${className}VO ${classNameFirstLower}VO,StringBuilder sql, Map<String, Object> paramMap){
    	if(${classNameFirstLower}VO!=null){  
        	<#list table.columns as column>
        	<#if column.javaType=="String">if(StringUtil.isNotEmpty(${classNameFirstLower}VO.get${column.columnName}()))<#else>if(${classNameFirstLower}VO.get${column.columnName}()!=null)</#if>{
	            sql.append("   AND ${gh.lower(column.sqlName)}=:${column.columnNameLower} ");
	            paramMap.put("${column.columnNameLower}",${classNameFirstLower}VO.get${column.columnName}());
	        }
        	</#list>
        }
    }

    private String getSelectSQL(){
    	String sql="${table.sourceSql}";
    	return sql;
    }
    
    
    /**
     * 查询${className}记录
     */
    public List<${className}VO> get${className}ListByParam(${className}VO ${classNameFirstLower}VO,PaginationCondition pc)throws Exception{
    	
        logger.info("In function : get${className}ListByParam: ${classNameFirstLower}VO={},pc={}", new Object[]{${classNameFirstLower}VO,pc});
        Map<String, Object> paramMap = new HashMap<String, Object>();
          
        StringBuilder sql = new StringBuilder();
        sql.append(getSelectSQL());
        
        putWhereParam(${classNameFirstLower}VO,sql,paramMap);
        String sqlstr=PaginationParams.convertSqlStatement(sql.toString(), pc, paramMap);
        logger.info(" About to execute sql={} paramMap={}", new Object[]{sqlstr, paramMap});
        List<${className}VO> result = baseDao.namedParameterJdbcTemplate.query(sqlstr, paramMap, new BeanPropertyRowMapper<${className}VO>(${className}VO.class));  
        
        logger.info("End function : get${className}ListByParam");
        return result;
    }
    
    
    /**
     * 查询总数
     */
    public int getTotal${className}ByParam(${className}VO ${classNameFirstLower}VO) throws Exception{
    	logger.info("In function : getTotal${className}ByParam: ${classNameFirstLower}VO={}", new Object[]{${classNameFirstLower}VO});
    	StringBuilder sql=new StringBuilder();
    	<#if gh.fromTable>
    	sql.append("SELECT COUNT(1) FROM ${gh.lower(table.sqlName)} WHERE 1=1 ");
    	<#else>
    	sql.append("${table.sourceSql}");
    	</#if>
    	Map<String, Object> paramMap = new HashMap<String, Object>();
    	putWhereParam(${classNameFirstLower}VO,sql,paramMap);
    	//查询记录总数
        logger.info(" About to execute sql={} paramMap={}",new Object[]{sql.toString(), paramMap});
        int result = baseDao.namedParameterJdbcTemplate.queryForInt(sql.toString(), paramMap);
        
        logger.info(" End Function: getTotal${className}ByParam");
        return result;
    }
    
    
  
    /**
     * 根据id查询${className}记录
     */
    public ${className}VO get${className}ById(long id)throws Exception{
    	
        logger.info("In function : get${className}ById: id={}", new Object[]{id});
        
        StringBuilder sql = new StringBuilder();
        sql.append(getSelectSQL());
        sql.append(" AND <#list table.columns as column><#if column.pk>${gh.lower(column.sqlName)}=:id</#if></#list>");
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("id", id);
        
        logger.info(" About to execute sql={} paramMap={}", new Object[]{sql.toString(), paramMap});
        ${className}VO result = baseDao.namedParameterJdbcTemplate.queryForObject(sql.toString(), paramMap, new BeanPropertyRowMapper<${className}VO>(${className}VO.class));   
        logger.info("End function : get${className}ById");
        return result;
    }

}