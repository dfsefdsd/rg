package cn.org.rapid_framework.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.org.rapid_framework.generator.ext.MyMethod;
import cn.org.rapid_framework.generator.ext.Parameter;
import cn.org.rapid_framework.generator.util.StringHelper;

public class GeneratorUtil {

	/**
	 * 是否存在指定的配置，配置在generator.xml中，例如，<entry key="basepackage">com.company.project</entry>
	 * @param methodName
	 * @return
	 */
	public boolean isConfigExists(String configName) {
		String configValue=GeneratorProperties.props.getProperty(configName,"");
		if(configValue==null||"".equals(configValue.trim())){
			return false;
		}
		return true;
	}
	/**
	 * 由给定的配置名取得配置值
	 * @param configName
	 * @return
	 * @throws Exception 
	 */
	public String[]  getConfigValue(String configName) throws Exception {
		String configValue=GeneratorProperties.props.getProperty(configName,"");	
		if(configValue==null||"".equals(configValue.trim())){
			throw new Error();
		}
		
		return configValue.split(",");
	}
	
	/**
	 * 由给定的配置名取得配置值
	 * @param configName
	 * @return
	 * @throws Exception 
	 */
	public String  getConfigSingleValue(String configName) throws Exception {
		String configValue=GeneratorProperties.props.getProperty(configName,"");	
		if(configValue==null||"".equals(configValue.trim())){
			throw new Error();
		}
		
		return configValue;
	}
	/**
	 * 字符串第一个字母小写
	 * @param str
	 * @return
	 */
	public String uncapitalize(String str){
		return StringHelper.uncapitalize(str);
	}
	
	public String lower(String str){
		return str.toLowerCase();
	}
	/**
	 * 
	 * @param configName
	 * @return
	 */
	public List<MyMethod> getConfigMethods(String configName){
		//检查参数
		String configValue=GeneratorProperties.props.getProperty(configName,"");	
		if(configValue==null||"".equals(configValue.trim())){
			throw new Error();
		}
		
		String methodsStrs[]=configValue.split(";");
		List<MyMethod> methods=new LinkedList<MyMethod>();
		String aMethodsStr=null;
		MyMethod amethod=null;
		for(int i=0;i<methodsStrs.length;i++){
			aMethodsStr=methodsStrs[i].trim();
			if("".equals(aMethodsStr)){
				continue;
			}
			methods.add(getMethodFromStr(aMethodsStr));			
		}	
		return methods;
	}
	/**
	 * 从给定的字符串返回一个函数描述对象
	 * @param defineStr 格式为       private MyMethod getMethodFromStr(String str)
	 * @return
	 */
	private MyMethod getMethodFromStr(String defineStr){

		Pattern pattern =Pattern.compile("(\\w+)\\s+(\\w+)\\s+([\\w\\$]+)\\(([^\\)]*)\\)");
		Matcher matcher=pattern.matcher(defineStr);
		
		if(matcher.find()){
			MyMethod method=new MyMethod();
			method.setDefineStr(matcher.group());
			method.setAccessType(matcher.group(1));
			method.setReturnType(matcher.group(2));
			method.setMethodName(matcher.group(3));
			method.setParamStr(matcher.group(4));
			method.setParas(getParams(matcher.group(4)));
			method.setParamNames(getParamNames(method.getParas()));
			return method;
		}else{
			throw new Error();
		}
	}
	/**
	 * 取得参数的名字列表
	 * @param params
	 * @return
	 */
	private String getParamNames(List<Parameter> params){
		StringBuilder paramNames=new StringBuilder();
		for (int i = 0; i < params.size(); i++) {
			Parameter parameter = params.get(i);
			paramNames.append(parameter.getParamName());
			paramNames.append(",");
		}
		if(paramNames.length()>0){
			paramNames.deleteCharAt(paramNames.length()-1);
		}
		
		return paramNames.toString();

	}
	/**
	 * 从给定字符串返回参数对象集
	 * @param paramStr
	 * @return
	 */
	private List<Parameter> getParams(String paramStr){
		List<Parameter> params=new LinkedList<Parameter>();
		
		String paramsStrs[]=paramStr.split(",");
		String aparamStr=null;
		
		for(int i=0;i<paramsStrs.length;i++){
			aparamStr=paramsStrs[i].trim();
			if("".equals(aparamStr)){
				continue;
			}
			params.add(getAParam(aparamStr));
		}
		return params;		
	}
	
	/**
	 * 解析参数对象
	 * @param aparamStr
	 * @return
	 */
	private Parameter getAParam(String aparamStr){
		Pattern pattern =Pattern.compile("([\\w\\_\\$]+)\\s+([\\w\\_\\$]+)");
		
		Matcher matcher=pattern.matcher(aparamStr);
		
		if(matcher.find()){
			Parameter aparam=new Parameter();
			aparam.setParamType(matcher.group(1));
			aparam.setParamName(matcher.group(2));
			return aparam;
		}else{
			throw new Error();
		}		
	}
	/**
	 * 去掉字符串中给定的符号
	 * @author huber.lv
	 * @since 2012-11-15
	 * @param sqlName
	 * @param splite
	 * @return
	 */
	public  String worksUpperCase(String sqlName,String splite) {
		String[] strs = sqlName.toLowerCase().split(splite);
		String result = "";
		String preStr = "";
		for(int i = 0; i < strs.length; i++) {
			if(preStr.length() == 1) {
				result += strs[i];
			}else {
				result += StringHelper.capitalize(strs[i]);
			}
			preStr = strs[i];
		}
		return result;
	}
	
	public String replaceAll(String str,String regex,String replacement){
		return str.replaceAll(regex, replacement);
	}

	private static boolean fromTable=true;
	
	public boolean getFromTable(){
		return fromTable;
	}
	
	public static void setFromTable(boolean flag){
		fromTable= flag;
	}
}
