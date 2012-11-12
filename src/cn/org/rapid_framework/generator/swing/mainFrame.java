/*
 * mainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package cn.org.rapid_framework.generator.swing;

import java.io.IOException;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;
import cn.org.rapid_framework.generator.provider.db.sql.SqlFactory;
import cn.org.rapid_framework.generator.provider.db.sql.model.Sql;

/**
 *
 * @author  __USER__
 */
public class mainFrame extends javax.swing.JFrame {

	/** Creates new form mainFrame */
	public mainFrame() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		generator = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		sql = new javax.swing.JTextArea();
		generateBysql = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		schmme = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		table = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jPanel5 = new javax.swing.JPanel();
		result = new javax.swing.JLabel();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setToolTipText("\u7531\u8868\u751f\u6210");

		generator.setText("\u751f\u6210");
		generator.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generatorActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(353, 353, 353)
						.addComponent(generator).addContainerGap(387,
								Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(generator).addContainerGap(300,
								Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7531\u8868\u751f\u6210", jPanel1);

		sql.setColumns(20);
		sql.setRows(5);
		jScrollPane1.setViewportView(sql);

		generateBysql.setText("\u6839\u636eSQL\u751f\u6210");
		generateBysql.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generateBysqlActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																777,
																Short.MAX_VALUE)
														.addComponent(
																generateBysql))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(19, 19, 19)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												270,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(generateBysql)
										.addContainerGap(24, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7531SQL\u751f\u6210", jPanel4);

		schmme.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				schmmeActionPerformed(evt);
			}
		});
		schmme.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				schmmeFocusLost(evt);
			}
		});

		jLabel1.setText("\u7528\u6237\u540d:");

		jLabel2.setText("\u8868\u540d:");

		table.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tableActionPerformed(evt);
			}
		});

		jLabel3.setText("\u5305\u540d\uff1a");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				jTextField1FocusLost(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												schmme,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												table,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												79,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(425, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(schmme,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(jLabel2)
														.addComponent(
																table,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addComponent(jPanel2,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(78, Short.MAX_VALUE)));

		jMenu1.setText("File");
		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");
		jMenuBar1.add(jMenu2);

		result.setText("       ");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(result).addContainerGap(750,
								Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(result).addContainerGap(26,
								Short.MAX_VALUE)));

		jMenu3.setText("File");
		jMenuBar2.add(jMenu3);

		jMenu4.setText("Edit");
		jMenuBar2.add(jMenu4);

		setJMenuBar(jMenuBar2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup().addComponent(
								jTabbedPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 802,
								Short.MAX_VALUE).addContainerGap()).addGroup(
						layout.createSequentialGroup().addComponent(jPanel5,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												375,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.getAccessibleContext()
				.setAccessibleName("generateBytable");

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("basepackage",
				this.jTextField1.getText().trim());
		
	}

	private void schmmeFocusLost(java.awt.event.FocusEvent evt) {

		GeneratorProperties.getProperties().setProperty("jdbc.schema",
				this.schmme.getText().trim());
		
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void schmmeActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void generatorActionPerformed(java.awt.event.ActionEvent evt) {
		String tableName = this.table.getText().trim();
		if ("".equals(tableName)) {
			result.setText("表名不能为空!");
			return;
		}
		this.generator.setEnabled(false);
		try {

			GeneratorFacade g = new GeneratorFacade();
			g.generateByTable(tableName, "template/bytable/gmc");
			//打开文件夹
			Runtime.getRuntime().exec(
					"cmd.exe /c start "
							+ GeneratorProperties
									.getRequiredProperty("outRoot"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.result.setText(e.getMessage());
		} //删除生成器的输出目录
		this.generator.setEnabled(true);
		this.result.setText("已生成");
	}

	private void generateBysqlActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			String tableName = this.table.getText().trim();
			String sql = this.sql.getText().trim();
			if ("".equals(sql)) {
				result.setText("sql不能为空!");
				return;
			}
			if ("".equals(tableName)) {
				result.setText("表名不能为空!");
				return;
			}
			this.generateBysql.setEnabled(false);
			GeneratorFacade g = new GeneratorFacade();
			Sql sqlo = new SqlFactory().parseSql(sql); //同时支持 #param# $param$ #{param} ${param} :param 几种占位符  
			sqlo.setTableSqlName(tableName);

			sqlo.setMultiplicity("many"); //many or one,用于控制查询结果是one,many      
			sqlo.setOperation("");
			g.generateBySql(sqlo, "template/bysql/gmc");
			//打开文件夹
			Runtime.getRuntime().exec(
					"cmd.exe /c start "
							+ GeneratorProperties
									.getRequiredProperty("outRoot"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.result.setText(e.getMessage());
		} //删除生成器的输出目录
		this.generateBysql.setEnabled(true);
		this.result.setText("已生成");
	}

	private void tableActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mainFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton generateBysql;
	private javax.swing.JButton generator;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JLabel result;
	private javax.swing.JTextField schmme;
	private javax.swing.JTextArea sql;
	private javax.swing.JTextField table;
	// End of variables declaration//GEN-END:variables

}