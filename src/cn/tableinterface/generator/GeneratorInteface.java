package cn.tableinterface.generator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratorInteface {
	public List<Map<String,Object>> generatorFormExcel(String filePath){
		String[] titles=POIExcelUtil.readTitle(filePath).get(0);
		List<String[]> rows=POIExcelUtil.readXlsx(filePath, true);
		List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
		for (String[] map : rows) {
			Map<String,Object> row=new HashMap<String,Object>();
			for (int i=0;i< titles.length;i++) {
				row.put(titles[i], map[i]);
			}
			data.add(row);
		}
		return data;
	}
	
	private Field getFieldFromRow(String[] row){
		Field field=new Field();
		field.setName(row[0]);
		field.setParent(row[1]);
		field.setDesc(row[2]);
		field.setRequire(row[3]);
		field.setType(row[4]);
		field.setValueDesc(row[5]);
		return field;
	}
	
	public static  void main(String[] args){
		GeneratorInteface g= new GeneratorInteface();
		System.out.println(g.generatorFormExcel("D:/intefface.xls"));
	}

}
