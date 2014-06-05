/*
 * Copyright &copyright; 2012 天涯社区
 * All rights reserved.
 */

package cn.tableinterface.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.h2.util.StringUtils;

/**
 * @author 作者 LXL 罗小龙
 * @version 1.0 创建时间：2012-6-6 上午10:12:40 类说明 基于APCHE的poi实现读写excel2003和excel2007
 * 注:需要4个包的支持，分别是poi-3.8-20120326.jar、poi-ooxml-3.8-20120326.jar、
 * poi-ooxml-schemas-3.8-20120326.jar、xmlbeans-2.3.0.jar
 */
public class POIExcelUtil {
	
	/**
	 * 读取excel2007格式兼容2003格式(*.xlsx、*.xls)
	 * 只适用于该工作表只存在一个sheet
	 * @param filePath
	 * @param ifHaveTitle是否存在标题行，若存在，则不输出标题行
	 * description TODO
	 * author luoxiaolong 
	 * date 2012-6-6 上午10:56:03
	 */
	public static List<String[]> readTitle(String filePath) {
		// 构造Workbook 对象，strPath 传入文件路径
		List<String[]> list = new ArrayList<String[]>();
		FileInputStream is;
		Workbook book = null;
		Row row = null;
		Sheet sheet = null;
		try {
			File f = new File(filePath);
			is = new FileInputStream(f);
			book = WorkbookFactory.create(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取第一章表格内容
		sheet = book.getSheetAt(0);
		// 定义 row、cell
		String cell;
		//int firstNum = sheet.getFirstRowNum();
		
		row = sheet.getRow(0);
		String[] cellValues = new String[row.getLastCellNum()];
		for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
			// 获取单元格内容，
			cell = getStringCellValue(row.getCell(j));
			cellValues[j] = cell;
		list.add(cellValues);
		}

		return list;
	}
	
	/**
	 * 读取excel2007格式兼容2003格式(*.xlsx、*.xls)
	 * 只适用于该工作表只存在一个sheet
	 * @param filePath
	 * @param ifHaveTitle是否存在标题行，若存在，则不输出标题行
	 * description TODO
	 * author luoxiaolong 
	 * date 2012-6-6 上午10:56:03
	 */
	public static List<String[]> readXlsx(String filePath, boolean ifHaveTitle) {
		// 构造Workbook 对象，strPath 传入文件路径
		List<String[]> list = new ArrayList<String[]>();
		FileInputStream is;
		Workbook book = null;
		Row row = null;
		Sheet sheet = null;
		try {
			File f = new File(filePath);
			is = new FileInputStream(f);
			book = WorkbookFactory.create(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取第一章表格内容
		sheet = book.getSheetAt(0);
		// 定义 row、cell
		String cell;
		int firstNum = sheet.getFirstRowNum();
		// 循环输出表格中的内容
		if (ifHaveTitle) {
			firstNum = sheet.getFirstRowNum() + 1;
		}
		for (int i = firstNum; i < sheet.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			String[] cellValues = new String[row.getLastCellNum()];
			for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
				// 获取单元格内容，
				cell = getStringCellValue(row.getCell(j));
				cellValues[j] = cell;
			}
			list.add(cellValues);
		}

		return list;
	}
	
	
	/**
	 * 读取excel2007格式兼容2003格式(*.xlsx、*.xls)文件的总行数
	 * 只适用于该工作表只存在一个sheet
	 * @param filePath
	 * @param ifHaveTitle是否存在标题行，若存在，则不输出标题行
	 * description TODO
	 * author luoxiaolong 
	 * date 2012-6-6 上午10:56:03
	 */
	public static int readXlsxRowNum(String filePath, boolean ifHaveTitle) {
		// 构造Workbook 对象，strPath 传入文件路径
		FileInputStream is;
		Workbook book = null;
		Sheet sheet = null;
		try {
			File f = new File(filePath);
			is = new FileInputStream(f);
			book = WorkbookFactory.create(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取第一章表格内容
		sheet = book.getSheetAt(0);
		int fileRow = sheet.getPhysicalNumberOfRows();
		return fileRow;
	}
	 
 	/**
	 * 生成excel文件
	 * @param fliePath 生成的文件路径
	 * @param sheetName sheet名称
	 * @param list 数据集
	 * description TODO
	 * author luoxiaolong 
	 * date 2012-6-6 上午11:38:45
	*/
	public static void writeExcel(String filePath, String sheetName,List<String[]> list) {
		// 工作簿
		XSSFWorkbook hssfworkbook = new XSSFWorkbook();
		// 获得CreationHelper对象,这个应该是一个帮助类
		// XSSFCreationHelper helper=hssfworkbook.getCreationHelper();
		// 创建sheet页
		XSSFSheet hssfsheet = hssfworkbook.createSheet();
		// 设置sheet名称
		if (StringUtils.isNullOrEmpty(sheetName)) { // 设置sheet的名字
			hssfworkbook.setSheetName(0, "sheet1");
		} else {
			hssfworkbook.setSheetName(0, sheetName);
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 写入所有内容行
		int g = 0;
		for (int i = 0; i < list.size(); i++) {
			XSSFRow row = hssfsheet.createRow(i);
			String[] obj = list.get(i);
			for (int j = 0; j < obj.length; j++) {
				XSSFCell cell = row.createCell((short) g);
				cell.setCellValue(obj[j]);
				g++;
			}
			g = 0;
		}
		try {
			hssfworkbook.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
	
	/**
	 * 生成excel文件
	 * @param fliePath 生成的文件路径
	 * @param sheetName sheet名称
	 * @param list 数据集
	 * description TODO
	 * author luoxiaolong 
	 * date 2012-6-6 上午11:38:45
	*/
	public static void writeExcel(OutputStream os, String sheetName,List<Map<String, Object>> list,Map<Integer, Integer> colMap) {
		// 工作簿
		XSSFWorkbook hssfworkbook = new XSSFWorkbook();
		// 获得CreationHelper对象,这个应该是一个帮助类
		// XSSFCreationHelper helper=hssfworkbook.getCreationHelper();
		// 创建sheet页
		XSSFSheet hssfsheet = hssfworkbook.createSheet();
		// 设置sheet名称
		if (StringUtils.isNullOrEmpty(sheetName)) { // 设置sheet的名字
			hssfworkbook.setSheetName(0, "sheet1");
		} else {
			hssfworkbook.setSheetName(0, sheetName);
		}
		//字体  
		XSSFFont font = hssfworkbook.createFont();  
		font.setBoldweight((short)1000);  
		font.setFontName("宋体");
		font.setFontHeightInPoints((short)15); //设置字体大小
		XSSFCellStyle cellStyle = hssfworkbook.createCellStyle(); 
		cellStyle.setFont(font);
		// 写入所有内容行
		int g = 0;
		for (int i = 0; i < list.size(); i++) {
			XSSFRow row = hssfsheet.createRow(i);
			Map<String, Object> obj = list.get(i);
			XSSFCell cell = null;
			Set<Map.Entry<String, Object>> set1 = obj.entrySet();
	        for (Iterator<Map.Entry<String, Object>> it = set1.iterator(); it.hasNext();) {
	            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
	            cell = row.createCell((short) g);
	            cell.setCellStyle(cellStyle);
	            cell.setCellValue(entry.getValue()+"");
	            g++;
	        }
			g = 0;
		}
		
		if (colMap == null) {
			hssfsheet.setDefaultColumnWidth(25);
		}else{
			Set<Map.Entry<Integer, Integer>> set = colMap.entrySet();
			for (Iterator<Map.Entry<Integer, Integer>> it = set.iterator(); it.hasNext();) {
				Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
				hssfsheet.setColumnWidth(entry.getKey(), entry.getValue() * 256);
			}
		}
		try {
			hssfworkbook.write(os);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
	/**
	 * 获取单元格数据内容为字符串类型的数据
	 * 
	 * @param cell Excel单元格
	 * @return String 单元格数据内容
	 */
	public static String getStringCellValue(Cell cell) {
		String strCell = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			strCell =cell.getNumericCellValue()+""; 
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_BLANK:
			strCell = "";
			break;
		default:
			strCell = "";
			break;
		}
		if (strCell.equals("") || strCell == null) {
			return "";
		}
		return strCell;
	}
	
	/**
	 * 去掉小数点后的0和小数点
	 * @param s
	 * @return
	 */
	public static String subZeroAndDot(String s){
		if (s.indexOf(".")>0) {
			s = s.replaceAll("0+?$", "");//去掉多余的0  
			s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
		}
		return s;
	}

	/*public static void main(String[] args) {
		List<String [] > list = readXlsx("C:/Users/maoJx/Desktop/1.xlsx", false);
		for (int i = 0; i < list.size(); i++) {
			String [] s = list.get(i);
			System.out.println(s[0]);
		}
		//writeExcel1("C:/Users/maoJx/Desktop/xiao1.xls", "不是吧", list);
	}*/

	
}
