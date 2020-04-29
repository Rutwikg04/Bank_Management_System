package com.UI.Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroPage extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroPage frame = new IntroPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntroPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(0, 0, 620, 69);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVrapBank = new JLabel("VRAP BANK");
		lblVrapBank.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblVrapBank.setBounds(178, 11, 186, 36);
		panel.add(lblVrapBank);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Icons/bank-icon.png"));
		label.setBounds(364, 0, 54, 58);
		panel.add(label);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(178, 45, 176, 2);
		panel.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(421, 67, 2, 358);
		contentPane.add(separator);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnNewButton.setBounds(478, 367, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin.main(null);
				dispose();
			}
		});
		
		JTextArea txtrVrapBankIs = new JTextArea();
		txtrVrapBankIs.setBackground(new Color(240, 240, 240));
		txtrVrapBankIs.setWrapStyleWord(true);
		txtrVrapBankIs.setLineWrap(true);
		txtrVrapBankIs.setEditable(false);
		txtrVrapBankIs.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txtrVrapBankIs.setText("VRAP Bank is a newly organized bank with multiple facilities.It is developed by 'ZERO Developing Group' in the year 2018.'VRAP Bank' Provides you with multiple Banking Facilities Like 'Withdraw','Deposit','Loan',etc.");
		txtrVrapBankIs.setBounds(10, 171, 401, 129);
		contentPane.add(txtrVrapBankIs);
		
		JTextArea txtrWelcomeToVrap = new JTextArea();
		txtrWelcomeToVrap.setBackground(new Color(240, 240, 240));
		txtrWelcomeToVrap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtrWelcomeToVrap.setText("WELCOME TO VRAP BANK");
		txtrWelcomeToVrap.setWrapStyleWord(true);
		txtrWelcomeToVrap.setLineWrap(true);
		txtrWelcomeToVrap.setBounds(10, 125, 401, 35);
		contentPane.add(txtrWelcomeToVrap);
		
		JTextArea txtrWeHopeYou = new JTextArea();
		txtrWeHopeYou.setBackground(new Color(240, 240, 240));
		txtrWeHopeYou.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txtrWeHopeYou.setText("We hope you enjoy Banking With us.");
		txtrWeHopeYou.setWrapStyleWord(true);
		txtrWeHopeYou.setLineWrap(true);
		txtrWeHopeYou.setBounds(10, 311, 401, 53);
		contentPane.add(txtrWeHopeYou);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_1.setBounds(560, 74, 50, 45);
		btnNewButton_1.setIcon(new ImageIcon(IntroPage.class.getResource("/Icons/Phone-icon (1).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please contact Branch\n Varun Godambe \t: 1234567890\n Pritesh Gandhi \t: 9876543210");
			}
		});
		contentPane.add(btnNewButton_1);
		getContentPane().add(btnNewButton_1);
		validate();
	}
}
