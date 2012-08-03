package cn.org.rapid_framework.generator.ext;

import java.util.LinkedList;
import java.util.List;


public class MyMethod {
	private String defineStr;
	private String accessType;
	private String returnType;
	private String methodName;
	private String paramStr;
	
	private String paramNames;
	private List<Parameter> paras=new LinkedList<Parameter>();
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public List<Parameter> getParas() {
		return paras;
	}
	public void setParas(List<Parameter> paras) {
		this.paras = paras;
	}
	public void setDefineStr(String defineStr) {
		this.defineStr = defineStr;
	}
	public String getDefineStr() {
		return defineStr;
	}
	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}
	public String getParamStr() {
		return paramStr;
	}
	public void setParamNames(String paramNames) {
		this.paramNames = paramNames;
	}
	public String getParamNames() {
		return paramNames;
	}


}
