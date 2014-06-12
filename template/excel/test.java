import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.tianya.travel.di.test.GeneratorTestCaseUtil;


public class test {	
	<#if gh.invoke(excel,"size")<6>
	/**
	 * @Title: ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}
	 * @Description:TODO(${gh.getValue(excel[0],"元素描述")})
	<#list excel as row>
	<#if row_index!=0>
	 * @param  ${gh.getValue(row,"元素名称")} ${gh.getValue(row,"元素描述")}, 是否必传:${gh.getValue(row,"是否必传")}, 类型 ${gh.getValue(row,"类型")}, 取值说明:${gh.getValue(row,"取值说明")}
	</#if>
	</#list>
	 * @return
	 */
	public static String ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(<#list excel as row><#if row_index!=0>${gh.getValue(row,"类型")} ${gh.getValue(row,"元素名称")}<#if row_has_next>,</#if></#if></#list>)throws Exception {
		<#list excel as row>
		<#if row_index!=0>	
			<#if gh.getValue(row,"是否必传")="是">
				<#if gh.getValue(row,"类型")="Integer">
	    if(null==${gh.getValue(row,"元素名称")}){
	    	throw new Exception("${gh.getValue(row,"元素描述")}不能为空!");
	    }
	            <#else>
	    if(StringUtil.isNullOrBlank(${gh.getValue(row,"元素名称")})){
	    	throw new Exception("${gh.getValue(row,"元素描述")}不能为空!");
	    }
				</#if>
			</#if>
		</#if>
		</#list>	
		
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		<#list excel as row>
		<#if row_index!=0>
		paramsMap.put("${gh.getValue(row,"元素名称")}",${gh.getValue(row,"元素名称")});
		</#if>
		</#list>	
		String result = request(HOTEL_GROUP_SEARCH_URL, "${gh.getValue(excel[0],"取值说明")}",
				paramsMap);
		return result;
	}
	@Test
	public void ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}() {
		String result = ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(<#list excel as row><#if row_index!=0>null<#if row_has_next>,</#if></#if></#list>);
		System.out.println(result);
		Assert.assertNotNull(result);
	}

	<#else>
	/**
	 * @Title: ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}
	 * @Description:TODO(${gh.getValue(excel[0],"元素描述")})
	 * @param paramsMap 参数map对象,其中的属性如下： 
	<#list excel as row>
	<#if row_index!=0>
	 * ${gh.getValue(row,"元素名称")} ${gh.getValue(row,"元素描述")}, 是否必传:${gh.getValue(row,"是否必传")}, 类型 ${gh.getValue(row,"类型")}, 取值说明:${gh.getValue(row,"取值说明")}
	</#if>
	</#list>
	 * @return
	 */
	public static String ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(Map<String, Object> paramsMap)throws Exception {
		if(paramsMap==null){
			throw new Exception("参数不能为空!");
		}
		<#list excel as row>
		<#if row_index!=0>	
			<#if gh.getValue(row,"是否必传")="是">
				<#if gh.getValue(row,"类型")="Integer">
	    if(paramsMap.get("${gh.getValue(row,"元素名称")}")==null){
	    	throw new Exception("${gh.getValue(row,"元素描述")}不能为空!");
	    }
	            <#else>
	    if(paramsMap.get("${gh.getValue(row,"元素名称")}")==null||StringUtil.isNullOrBlank(paramsMap.get("${gh.getValue(row,"元素名称")}").toString())){
	    	throw new Exception("${gh.getValue(row,"元素描述")}不能为空!");
	    }
				</#if>
			</#if>
		</#if>
		</#list>	
		String result = request(HOTEL_GROUP_SEARCH_URL, "${gh.getValue(excel[0],"取值说明")}",
				paramsMap);
		return result;
	}
	@Test
	public void ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}() {
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		<#list excel as row>
		<#if row_index!=0>
		paramsMap.put("${gh.getValue(row,"元素名称")}",null);//${gh.getValue(row,"元素描述")};${gh.getValue(row,"取值说明")}
		</#if>
		</#list>	
		String result = ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(paramsMap);
		System.out.println(result);
	}
	</#if>
	
	@DataProvider(name = "${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}Data")
	public Object[][] getData() {
		Object[][] metaData=new Object[][] {
				<#list excel as row>
				<#if row_index!=0>
				{${gh.getValue(row,"测试用例")}}<#if row_has_next>,</#if>
				</#if>
				</#list>
				};
		Object[][]  cases= GeneratorTestCaseUtil.getCase(metaData);
		return cases;
	}
	
	@Test(dataProvider ="${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}Data")
	public void ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(<#list excel as row><#if row_index!=0>${gh.getValue(row,"类型")} ${gh.getValue(row,"元素名称")}<#if row_has_next>,</#if></#if></#list>) {
		logger.error("<#list excel as row><#if row_index!=0>${gh.getValue(row,"元素名称")}={}<#if row_has_next>,</#if></#if></#list>",
				new Object[]{<#list excel as row><#if row_index!=0>${gh.getValue(row,"元素名称")}<#if row_has_next>,</#if></#if></#list>});
		try{
			<#if gh.invoke(excel,"size")<6>
			String result = ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(<#list excel as row><#if row_index!=0>null<#if row_has_next>,</#if></#if></#list>);
			System.out.println(result);
			Assert.assertNotNull(result);
			<#else>
			
			Map<String, Object> paramsMap = new HashMap<String, Object>();
			<#list excel as row>
			<#if row_index!=0>
			paramsMap.put("${gh.getValue(row,"元素名称")}",${gh.getValue(row,"元素名称")});//${gh.getValue(row,"元素描述")};${gh.getValue(row,"取值说明")}
			</#if>
			</#list>	
			String result = ${gh.uncapitalize(gh.getValue(excel[0],"取值说明"))}(paramsMap);
			System.out.println(result);
			Assert.assertNotNull(result);
			</#if>
			
			<#list excel as row>
			<#if row_index!=0>	
				<#if gh.getValue(row,"是否必传")="是">
					<#if gh.getValue(row,"类型")="Integer">
		    if(null==${gh.getValue(row,"元素名称")}){
				Assert.fail("${gh.getValue(row,"元素描述")}为空!应该抛出异常");
		    }
		            <#else>
		    if(StringUtil.isNullOrBlank(${gh.getValue(row,"元素名称")})){
				Assert.fail("${gh.getValue(row,"元素描述")}为空!应该抛出异常");
		    }
					</#if>
				</#if>
			</#if>
			</#list>
			
		}catch(Exception e){
			e.printStackTrace();
			boolean flag=false;
			<#list excel as row>
			<#if row_index!=0>	
				<#if gh.getValue(row,"是否必传")="是">
					<#if gh.getValue(row,"类型")="Integer">
		    if(null==${gh.getValue(row,"元素名称")}&&(e.getMessage().equals("${gh.getValue(row,"元素描述")}不能为空!"))){
		    	flag=true;
		    }
		            <#else>
		    if(StringUtil.isNullOrBlank(${gh.getValue(row,"元素名称")})&&(e.getMessage().equals("${gh.getValue(row,"元素描述")}不能为空!"))){
		    	flag=true;
		    }
		    Assert.assertTrue(flag);
					</#if>
				</#if>
			</#if>
			</#list>
			Assert.assertTrue(flag);
		}
	}
}
