package finance.datainit.service;

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

import finance.datainit.util.PaginationCondition;
import finance.datainit.vo.PaginationVO;
import finance.datainit.vo.${className}VO;
import java.util.Date;

public interface ${className}ServiceRemote {
    <#if gh.fromTable>
    /**
     * 新增记录
     */
    public boolean add${className}(${className}VO ${classNameFirstLower}VO)throws Exception;
    /**
     * 删除记录
     */
    public boolean delete${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>)throws Exception;
    /**
     * 更新记录
     */
    public boolean update${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}</#list>,<#list table.updateColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception;
    </#if>
    /**
     * 根据id查询记录
     */
    public ${className}VO get${className}ById(<#list table.pkColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception;
    
    /**
     * 查询记录
     */
    public PaginationVO<${className}VO> getPagination${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>PaginationCondition pc)throws Exception;
    /**
     * 查询总数
     */
    public int getTotal${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower}<#if column_has_next>,</#if></#list>)throws Exception; 
}