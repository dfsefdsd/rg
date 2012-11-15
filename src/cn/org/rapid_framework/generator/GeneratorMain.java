package cn.org.rapid_framework.generator;

import java.io.File;
import java.io.IOException;

import cn.org.rapid_framework.generator.provider.db.sql.SqlFactory;
import cn.org.rapid_framework.generator.provider.db.sql.model.Sql;

/**
 * 
 * @author badqiu
 * @email badqiu(a)gmail.com
 */

public class GeneratorMain {

	/**
	 * 请直接修改以下代码调用不同的方法以执行相关生成任务.
	 */
	public static void main(String[] args) throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		// g.printAllTableNames(); //打印数据库中的表名称

		g.deleteOutRootDir(); // 删除生成器的输出目录
		// g.generateByTable("im$message","template/gmc");
		// //通过数据库表生成文件,template为模板的根目录
		// g.generateByAllTable("template"); //自动搜索数据库中的所有表并生成文件,template为模板的根目录
		// g.generateByClass(Blog.class,"template_clazz");
		generateBySql(g);
		// g.deleteByTable("table_name", "template"); //删除生成的文件
		// 打开文件夹
		Runtime.getRuntime().exec(
				"cmd.exe /c start "
						+ GeneratorProperties.getRequiredProperty("outRoot"));
	}

	private static void generateBySql(GeneratorFacade g) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT *                                      ");
		sql.append("  FROM buyer$ext_contacts bec                   ");
		sql.append("  LEFT JOIN buyer$ext_buyers beb                ");
		sql.append("    ON beb.cur_contact_id = bec.ext_contact_id  ");
		sql.append(" WHERE bec.ext_comp_id =2611569                 ");
		sql.append("   AND rownum = 1                               ");
		sql.append(" ORDER BY bec.LAST_UPDATE_TIME desc             ");
		Sql sqlo = new SqlFactory().parseSql(sql.toString()); // 同时支持 #param#
																// $param$
																// #{param}
																// ${param}
																// :param 几种占位符
		sqlo.setTableSqlName("ImInqRecipients");
		

		sqlo.setMultiplicity("many"); // many or one,用于控制查询结果是one,many
		sqlo.setOperation("findByUsernameAndPassword");
		sqlo.setRemarks("根据用户名及密码进行查询");
		g.generateBySql(sqlo, "template/gmc");
	}
}
