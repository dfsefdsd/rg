/*
 * mainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package cn.org.rapid_framework.generator.swing;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;
import cn.org.rapid_framework.generator.GeneratorUtil;
import cn.org.rapid_framework.generator.provider.db.sql.SqlFactory;
import cn.org.rapid_framework.generator.provider.db.sql.model.Sql;
import cn.org.rapid_framework.generator.provider.db.table.TableFactory;
import cn.org.rapid_framework.generator.provider.db.table.model.Table;

/**
 *
 * @author  __USER__
 */
public class mainFrame extends javax.swing.JFrame {

	/** Creates new form mainFrame */
	public mainFrame() {
		initComponents();
		initConfig();
	}

	private void initConfig() {
		this.schmme.setText(GeneratorProperties.getProperty("jdbc.schema"));
		this.sequenceName.setText(GeneratorProperties
				.getProperty("sequenceName"));
		this.autoGenFile.setSelected("true".equals(GeneratorProperties
				.getProperty("autoGenFile")));
		this.coverFile.setSelected("true".equals(GeneratorProperties
				.getProperty("coverFile")));
		this.table.setText(GeneratorProperties.getProperty("tableName"));
		this.mvoPackage.setText(GeneratorProperties.getProperty("mvoPackage"));
		this.soaCorePackage.setText(GeneratorProperties
				.getProperty("soaCorePackage"));
		this.soaSrcPackage.setText(GeneratorProperties
				.getProperty("soaSrcPackage"));

		this.queryFields
				.setText(GeneratorProperties.getProperty("queryFields"));
		this.updateFields.setText(GeneratorProperties
				.getProperty("updateFields"));
		this.sql.setText(GeneratorProperties.getProperty("sql"));
		this.countSql.setText(GeneratorProperties.getProperty("countSql"));
		this.byIdFields.setText(GeneratorProperties.getProperty("byIdFields"));
		this.methodName.setText(GeneratorProperties.getProperty("methodName"));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		generator = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		schmme = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		sequenceName = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		updateFields = new javax.swing.JTextField();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		sql = new javax.swing.JTextArea();
		generateBysql = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		countSql = new javax.swing.JTextArea();
		jLabel11 = new javax.swing.JLabel();
		byIdFields = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		table = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		mvoPackage = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		soaCorePackage = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		soaSrcPackage = new javax.swing.JTextField();
		autoGenFile = new javax.swing.JRadioButton();
		coverFile = new javax.swing.JRadioButton();
		jLabel12 = new javax.swing.JLabel();
		methodName = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		queryFields = new javax.swing.JTextField();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jPanel5 = new javax.swing.JPanel();
		result = new javax.swing.JLabel();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("GMC\u4ee3\u7801\u751f\u6210\u5668");

		jPanel1.setToolTipText("\u7531\u8868\u751f\u6210");

		generator.setText("\u751f\u6210");
		generator.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generatorActionPerformed(evt);
			}
		});

		jLabel1.setText("\u7528\u6237\u540d:");

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

		jLabel6.setText("\u5e8f\u5217\u540d:");

		sequenceName.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				sequenceNameFocusLost(evt);
			}
		});

		jLabel8.setText("\u66f4\u65b0\u5b57\u6bb5:");

		updateFields.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				updateFieldsFocusLost(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(361,
																				361,
																				361)
																		.addComponent(
																				generator))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				schmme,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				84,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				sequenceName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				updateFields,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				684,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(113, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				sequenceName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								schmme,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								23,
																								Short.MAX_VALUE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								updateFields,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(186,
																				186,
																				186)
																		.addComponent(
																				generator)
																		.addGap(79,
																				79,
																				79)))));

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

		jLabel9.setText("\u5217\u8868\u67e5\u8be2sql:");

		jLabel10.setText("\u603b\u6570\u67e5\u8be2sql:");

		countSql.setColumns(20);
		countSql.setRows(5);
		countSql.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				countSqlFocusLost(evt);
			}
		});
		jScrollPane2.setViewportView(countSql);

		jLabel11.setText("\u5355\u503c\u67e5\u8be2\u5b57\u6bb5:");

		byIdFields.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				byIdFieldsFocusLost(evt);
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
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								841,
																								Short.MAX_VALUE)
																						.addComponent(
																								jScrollPane1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								841,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel11)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												byIdFields,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												660,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								jLabel9,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.Alignment.LEADING)))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(339,
																				339,
																				339)
																		.addComponent(
																				generateBysql)))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel11)
														.addComponent(
																byIdFields,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel9)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel10)
										.addGap(1, 1, 1)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(generateBysql)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7531SQL\u751f\u6210", jPanel4);

		jLabel2.setText("\u8868\u540d:");

		table.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tableActionPerformed(evt);
			}
		});

		jLabel3.setText("mvo\u5305\u540d\uff1a");

		mvoPackage.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mvoPackageActionPerformed(evt);
			}
		});
		mvoPackage.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				mvoPackageFocusLost(evt);
			}
		});

		jLabel4.setText("soa-core\u5305:");

		soaCorePackage.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				soaCorePackageFocusLost(evt);
			}
		});

		jLabel5.setText("soa-src\u5305:");

		soaSrcPackage.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				soaSrcPackageFocusLost(evt);
			}
		});

		autoGenFile.setText("\u81ea\u52a8\u751f\u6210\u5230\u76ee\u5f55");

		coverFile.setText("\u8986\u76d6\u6587\u4ef6");

		jLabel12.setText("\u65b9\u6cd5\u540d:");

		methodName.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				methodNameFocusLost(evt);
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
										.addComponent(autoGenFile)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(coverFile)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												table,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel12)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												methodName,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												57,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												mvoPackage,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												79,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												soaCorePackage,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												78,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												soaSrcPackage,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												72,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(22, Short.MAX_VALUE)));
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
														.addComponent(jLabel2)
														.addComponent(
																table,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																mvoPackage,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																soaCorePackage,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(
																soaSrcPackage,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																autoGenFile)
														.addComponent(coverFile)
														.addComponent(jLabel12)
														.addComponent(
																methodName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(13, Short.MAX_VALUE)));

		jLabel7.setText("\u67e5\u8be2\u5b57\u6bb5:");

		queryFields.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				queryFieldsFocusLost(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												queryFields,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												686,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(128, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																queryFields,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(70, Short.MAX_VALUE)));

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
						.addComponent(result)
						.addContainerGap(830, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(result)
						.addContainerGap(26, Short.MAX_VALUE)));

		jMenu3.setText("File");
		jMenuBar2.add(jMenu3);

		jMenu4.setText("Edit");
		jMenuBar2.add(jMenu4);

		setJMenuBar(jMenuBar2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jTabbedPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										870, Short.MAX_VALUE).addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel5,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTabbedPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										375,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel5,
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

	private void methodNameFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("methodName",
				this.methodName.getText().trim());
	}

	private void byIdFieldsFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("byIdFields",
				this.byIdFields.getText().trim());
	}

	private void countSqlFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("countSql",
				this.countSql.getText().trim());
	}

	private void updateFieldsFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("updateFields",
				this.updateFields.getText().trim());
	}

	private void queryFieldsFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("queryFields",
				this.queryFields.getText().trim());
	}

	private void sequenceNameFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("sequenceName",
				this.soaSrcPackage.getText().trim());
	}

	private void soaSrcPackageFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("soaSrcPackage",
				this.soaSrcPackage.getText().trim());
	}

	private void soaCorePackageFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("soaCorePackage",
				this.soaCorePackage.getText().trim());
	}

	private void mvoPackageFocusLost(java.awt.event.FocusEvent evt) {
		GeneratorProperties.getProperties().setProperty("mvoPackage",
				this.mvoPackage.getText().trim());

	}

	private void schmmeFocusLost(java.awt.event.FocusEvent evt) {

		GeneratorProperties.getProperties().setProperty("jdbc.schema",
				this.schmme.getText().trim());

	}

	private void mvoPackageActionPerformed(java.awt.event.ActionEvent evt) {

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
		this.queryFieldsFocusLost(null);
		this.updateFieldsFocusLost(null);
		this.byIdFieldsFocusLost(null);
		try {
			GeneratorUtil.setFromTable(true);
			GeneratorFacade g = new GeneratorFacade();
			g.deleteOutRootDir();
			g.generateByTable(tableName, "template/gmc");
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
		copyFiles(tableName);

	}

	private void copyFiles(String tableName) {
		if (this.autoGenFile.isSelected() == true) {
			Table table = TableFactory.getInstance().getTable(tableName);
			
			String mvoRoot = GeneratorProperties.getRequiredProperty("mvoRoot");
			String soaRoot = GeneratorProperties.getRequiredProperty("soaRoot");

			Map<String, String> afile = null;
			List<Map<String, String>> fileList = new ArrayList<Map<String, String>>();

			//处理soa文件
			afile = new HashMap<String, String>();
			afile.put("file", "VO.java");
			afile.put("path", "\\core\\com\\gm\\soa\\vo\\"
					+ GeneratorProperties.getRequiredProperty("soaCorePackage")
					+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);

			afile = new HashMap<String, String>();
			afile.put("file", "ServiceRemote.java");
			afile.put("path", "\\core\\com\\gm\\soa\\remote\\"
					+ GeneratorProperties.getRequiredProperty("soaCorePackage")
					+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);

			afile = new HashMap<String, String>();
			afile.put("file", "ServiceRemoteTest.java");
			afile.put("path", "\\test\\com\\gm\\soa\\remote\\"+ GeneratorProperties.getRequiredProperty("soaCorePackage")+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);

			afile = new HashMap<String, String>();
			afile.put("file", "DAO.java");
			afile.put("path", "\\src\\com\\gm\\soa\\dao\\"
					+ GeneratorProperties.getRequiredProperty("soaSrcPackage")
					+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);
			
			afile = new HashMap<String, String>();
			afile.put("file", "DAOTest.java");
			afile.put("path", "\\test\\com\\gm\\soa\\dao\\"
					+ GeneratorProperties.getRequiredProperty("soaSrcPackage")
					+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);

			afile = new HashMap<String, String>();
			afile.put("file", "Service.java");
			afile.put("path", "\\src\\com\\gm\\soa\\service\\"
					+ GeneratorProperties.getRequiredProperty("soaSrcPackage")
					+ "\\");
			afile.put("root", soaRoot);
			fileList.add(afile);
			
			moveFiles(fileList, "soa", table);

			

			//处理vo文件
			fileList = new ArrayList<Map<String, String>>();
			afile = new HashMap<String, String>();
			afile.put("file", "Controller.java");
			afile.put(
					"path",
					"\\"
							+ GeneratorProperties
									.getRequiredProperty("mvoPackage")
							+ "\\controller\\");
			afile.put("root", mvoRoot);
			fileList.add(afile);

			afile = new HashMap<String, String>();
			afile.put("file", "Service.java");
			afile.put(
					"path",
					"\\"
							+ GeneratorProperties
									.getRequiredProperty("mvoPackage")
							+ "\\service\\");
			afile.put("root", mvoRoot);
			fileList.add(afile);
			
			afile = new HashMap<String, String>();
			afile.put("file", "ServiceImpl.java");
			afile.put(
					"path","\\"+ GeneratorProperties.getRequiredProperty("mvoPackage")
							+ "\\service\\impl\\");
			afile.put("root", mvoRoot);
			fileList.add(afile);
			moveFiles(fileList, "vo", table);

		}
	}

	private void moveFiles(List<Map<String, String>> fileList,String floder,Table table){
		String outRoot = GeneratorProperties.getRequiredProperty("outRoot");
		for (Map<String, String> fileMap : fileList) {
			File file = new File(outRoot + "\\"+floder+"\\" + table.getClassName()
					+ fileMap.get("file"));
			if (file.exists()) {
				String dest = fileMap.get("root") + fileMap.get("path")
						+ table.getClassName() + fileMap.get("file");
				File destFile = new File(dest);
				if (destFile.exists()) {
					if ((this.coverFile.isSelected() == true)) {
						destFile.delete();
						file.renameTo(destFile);
						System.out.println(file.getAbsolutePath()+" is move to "+destFile.getAbsolutePath());
					}

				} else {
					if(destFile.mkdirs()){  
						file.renameTo(destFile);
						System.out.println(file.getAbsolutePath()+" is move to "+destFile.getAbsolutePath());
					}
				}
				
			}
		}
	}
	
	private void generateBysqlActionPerformed(java.awt.event.ActionEvent evt) {
		String tableName = this.table.getText().trim();
		String sql = this.sql.getText().trim();
		try {
			if ("".equals(sql)) {
				result.setText("sql不能为空!");
				return;
			}
			if ("".equals(tableName)) {
				result.setText("表名不能为空!");
				return;
			}
			GeneratorUtil.setFromTable(false);
			this.generateBysql.setEnabled(false);
			GeneratorFacade g = new GeneratorFacade();
			g.deleteOutRootDir();
			Sql sqlo = new SqlFactory().parseSql(sql); //同时支持 #param# $param$ #{param} ${param} :param 几种占位符  
			sqlo.setTableSqlName(tableName);

			sqlo.setMultiplicity("many"); //many or one,用于控制查询结果是one,many      
			sqlo.setOperation("");
			g.generateBySql(sqlo, "template/gmc");
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
		copyFiles(tableName);
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
	private javax.swing.JRadioButton autoGenFile;
	private javax.swing.JTextField byIdFields;
	private javax.swing.JTextArea countSql;
	private javax.swing.JRadioButton coverFile;
	private javax.swing.JButton generateBysql;
	private javax.swing.JButton generator;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
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
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField methodName;
	private javax.swing.JTextField mvoPackage;
	private javax.swing.JTextField queryFields;
	private javax.swing.JLabel result;
	private javax.swing.JTextField schmme;
	private javax.swing.JTextField sequenceName;
	private javax.swing.JTextField soaCorePackage;
	private javax.swing.JTextField soaSrcPackage;
	private javax.swing.JTextArea sql;
	private javax.swing.JTextField table;
	private javax.swing.JTextField updateFields;
	// End of variables declaration//GEN-END:variables

}