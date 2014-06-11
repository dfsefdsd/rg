package cn.org.rapid_framework.generator;

import java.util.ArrayList;
import java.util.List;


public class GeneratorTestCaseUtil {

	// case矩阵
	private Object[][] metaData;
	//取最大值是的case
	private int[] maxCase;
	
	public GeneratorTestCaseUtil(Object[][] metaData){
		this.metaData=metaData;
		maxCase=new int[metaData.length];
		for (int i=0; i<maxCase.length;i++) {
			maxCase[i]=metaData[i].length;
		}
	}
    /**
     * 取得所有的case的下标
     * @param maxCase like "11"
     * @return
     */
	public List<int[]> getCaseIndex(){
		List<int[]> result=new ArrayList<int[]>();
		int cases[]=new int[maxCase.length];
		int times=1;
		//计算case个数
		for (int i : maxCase) {
			times=times*i;
		}
		result.add(cases.clone());
		for(int i=0;i<times;i++){
			if(increase(cases,0)){
				result.add(cases.clone());
			}
		}
		return result;
	}
	/**
	 * case下标加一
	 * @param acase
	 * @param index
	 * @return
	 */
	private boolean increase(int[] acase,int index){
		if(index>=acase.length){
			return false;
		}
		//达到最大值时进一
		if(acase[index]==maxCase[index]-1){
			if(increase(acase, index+1)){
				acase[index]=0;
			}else{
				return false;
			}
		}else{
			acase[index]=acase[index]+1;
		}
		return true;
	}
	
	public Object [][] getCase(){
		List<int[]> caseIndex=getCaseIndex();
		List<Object[]> result=new ArrayList<Object[]>();
		for (int[] ci : caseIndex) {
			Object[] acase=new Object[ci.length];
			for(int i=0;i<ci.length;i++){
				acase[i]=metaData[i][ci[i]];
			}
			result.add(acase);
		}
		Object [][]objArray=new Object[result.size()][];
		for (int i=0;i< result.size();i++ ) {
			objArray[i]=result.get(i);
		}
		return objArray;
	}
	
	private static String ObjectArraytoString(Object[][]   cases){
		StringBuilder result=new StringBuilder();
		for (Object[] objArray : cases) {
			result.append("{");
			for (Object object : objArray) {
				
				if(object==null){
					result.append("null");
				}else if(object instanceof String){
					result.append("\"");
					result.append(object);
					result.append("\"");
				}else{
					result.append(object);
				}
				
				result.append(",");
			}
			result.deleteCharAt(result.length()-1);
			result.append("}");
			result.append(",\n");
		}
		result.deleteCharAt(result.length()-2);
		return result.toString();
	}
	
	public static void main(String []args){
		Object[][] metaData=new Object[][] {
				{ null, "test2" },
				{ null, "test4" },
				{ null },
				};
		Object[][]  cases=new GeneratorTestCaseUtil(metaData).getCase();
		System.out.println(ObjectArraytoString(cases));
	}
}
