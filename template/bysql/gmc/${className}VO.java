package ${basepackage};
<#assign className = sql.tableClassName>   
public class ${className}VO implements java.io.Serializable{
	<#list sql.columns as column>
	private ${column.javaType} ${column.columnNameLower}=null;
	</#list>

	<#list sql.columns as column>
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
}