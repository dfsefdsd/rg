package ${basepackage};
import java.io.Serializable;
<#assign className= table.className>    
public class ${className}VO implements Serializable{
	<#list table.columns as column>
	private ${column.javaType} ${column.columnNameLower}=null;
	</#list>

	<#list table.columns as column>
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
	
	public String toString(){
		StringBuilder result=new StringBuilder();
		result.append(super.toString());
		result.append(":{");
		<#list table.columns as column>
			result.append("${column.columnNameLower}=");
			result.append(${column.columnNameLower});
			<#if column_has_next>result.append(",");</#if>    
		</#list>
		result.append("}");
	}
}