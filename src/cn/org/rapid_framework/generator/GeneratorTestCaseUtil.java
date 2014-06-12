package cn.org.rapid_framework.generator;

import java.util.ArrayList;
import java.util.List;


public class GeneratorTestCaseUtil {
	
	public GeneratorTestCaseUtil(){

	}
    /**
     * 取得所有的case的下标
     * @param maxCase like "11"
     * @return
     */
	private static List<int[]> getCaseIndex(int[] maxCase){
		List<int[]> result=new ArrayList<int[]>();
		int cases[]=new int[maxCase.length];
		int times=1;
		//计算case个数
		for (int i : maxCase) {
			times=times*i;
		}
		result.add(cases.clone());
		for(int i=0;i<times;i++){
			if(increase(maxCase,cases,0)){
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
	private static boolean increase(int[] maxCase,int[] acase,int index){
		if(index>=acase.length){
			return false;
		}
		//达到最大值时进一
		if(acase[index]==maxCase[index]-1){
			if(increase(maxCase,acase, index+1)){
				acase[index]=0;
			}else{
				return false;
			}
		}else{
			acase[index]=acase[index]+1;
		}
		return true;
	}
	
	public static Object [][] getCase(Object[][] metaData){
		int[] maxCase=new int[metaData.length];
		for (int i=0; i<maxCase.length;i++) {
			maxCase[i]=metaData[i].length;
		}
		List<int[]> caseIndex=getCaseIndex(maxCase);
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
		Object[][]  cases= GeneratorTestCaseUtil.getCase(metaData);
		System.out.println(ObjectArraytoString(cases));
	}
}
