package com.UI.Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.admin.services.BankService;
import com.UI.Admin.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEmployee extends javax.swing.JFrame {

	/**
	 * Creates new form employeeReg
	 */
	public NewEmployee() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<String>();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jComboBox2 = new javax.swing.JComboBox<String>();
		jComboBox3 = new javax.swing.JComboBox<String>();
		jComboBox4 = new javax.swing.JComboBox<String>();
		jComboBox5 = new javax.swing.JComboBox<String>();
		jComboBox6 = new javax.swing.JComboBox<String>();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jComboBox7 = new javax.swing.JComboBox<String>();
		jButton1 = new javax.swing.JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jButtonActionPerformed(arg0);
			}
		});
		jSeparator1 = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(0, 102, 102));

		jButton2.setBackground(new java.awt.Color(0, 102, 102));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back-icon.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(0, 102, 102));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/symbol-delete-icon.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("Employee Registration");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel13)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
						.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(28, Short.MAX_VALUE)
						.addComponent(jLabel13)
						.addGap(24, 24, 24))
				);

		jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel1.setText("Designation");

		jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel2.setText("Name");

		jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel3.setText("Father's Name");

		jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel4.setText("Gender");

		jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel5.setText("DOB");

		jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel7.setText("Pan Card No.");

		jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel8.setText("Aadhar Card No.");

		jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel9.setText("Address");

		jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel10.setText("Phone No.");

		jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel11.setText("Email");

		jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel12.setText("Marital Status");

		jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jLabel6.setText("Blood Group");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Post", "Teller", "Auditor", "Manager", "Data Entry officer", "Loan Officer" }));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Others" }));

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999" }));

		jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Blood Group", "O+", "AB+", "A+", "B+", "A-", "B-", "AB-", "O-", " " }));

		jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Marital Status", "Single", "Married", "Widowed", "Divorced", "Separated" }));

		jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
		jButton1.setText("Submit");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(95, 95, 95)
										.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel2)
										.addGap(135, 135, 135)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel3)
										.addGap(82, 82, 82)
										.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel4)
										.addGap(124, 124, 124)
										.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel5)
										.addGap(144, 144, 144)
										.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(12, 12, 12)
										.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(13, 13, 13)
										.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel6)
										.addGap(93, 93, 93)
										.addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel7)
										.addGap(89, 89, 89)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel8)
										.addGap(68, 68, 68)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel9)
										.addGap(120, 120, 120)
										.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel10)
										.addGap(104, 104, 104)
										.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel11)
										.addGap(137, 137, 137)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel12)
										.addGap(83, 83, 83)
										.addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(200, 200, 200)
										.addComponent(jButton1)))
						.addContainerGap(273, Short.MAX_VALUE))
				.addComponent(jSeparator1)
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(40, 40, 40)
										.addComponent(jLabel2))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(30, 30, 30)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(32, 32, 32)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(10, 10, 10)
										.addComponent(jLabel3))
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(10, 10, 10)
										.addComponent(jLabel4))
								.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(42, 42, 42)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5)
								.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(40, 40, 40)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel6)
								.addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(40, 40, 40)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel7)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(40, 40, 40)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel8)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(40, 40, 40)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel9)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(30, 30, 30)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel10)
								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(42, 42, 42)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel11)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(60, 60, 60)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel12)
								.addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(60, 60, 60)
						.addComponent(jButton1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);

		jScrollPane2.setViewportView(jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(1, 1, 1))
				);

		pack();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		AdminMenu.main(null);
		dispose();
	}

	private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int found=0;
		BankService bs = new BankService();
		int id = bs.generateId(jComboBox1.getSelectedIndex());
		String ename = jTextField1.getText();
		String fname = jTextField2.getText();
		int gender = jComboBox2.getSelectedIndex();
		int date = jComboBox3.getSelectedIndex();
		int month = jComboBox4.getSelectedIndex();
		int year = jComboBox5.getSelectedIndex();
		int blood = jComboBox6.getSelectedIndex();
		String pan = jTextField3.getText();
		String aadhar = jTextField4.getText();
		String add = jTextField5.getText();
		String phone = jTextField6.getText();
		String email = jTextField7.getText();
		int marital = jComboBox7.getSelectedIndex();
		/*if( ename.matches("[a-zA-Z]+") || fname.matches("[a-zA-Z]+") )
			found = 1;
		int c;*/
/*		c=email.indexOf('.');
		if(c==-1)
			found = 1;
		c=email.indexOf('@');
		if(c==-1)
			found = 1;
*/		if(found == 0)
		{
			int a = bs.newAcc(id+1, ename, fname, gender, date, month-1, year+84, blood, pan, aadhar, add, phone, email, marital);
			if(a==1)
			{
				JOptionPane.showMessageDialog(null, "Successful\n Your ID is"+(id+1));
				AdminMenu.main(null);
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Some Error has occured.\nPlease try again later.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please fill valid details.");
			found=0;
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		System.exit(0);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewEmployee().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify                     
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JComboBox<String> jComboBox5;
	private javax.swing.JComboBox<String> jComboBox6;
	private javax.swing.JComboBox<String> jComboBox7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration                   
}
