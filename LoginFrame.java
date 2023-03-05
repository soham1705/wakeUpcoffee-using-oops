package com.seed.inDemo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	Label userLbl;
	Label pwdLbl;
	JTextField userTxtFld;
	JPasswordField pwdtxtField;
	JButton btnSubmit,btnCancel;
	Container contentPane;
	
	public LoginFrame() {
		userLbl=new Label("Username");
		pwdLbl=new Label("Password");
		
		userTxtFld=new JTextField(20);
		pwdtxtField=new JPasswordField(20);
		
		btnSubmit=new JButton("Submit");
		btnCancel = new JButton("Cancel");
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(userLbl);
		contentPane.add(userTxtFld);
		
		contentPane.add(pwdLbl);
		contentPane.add(pwdtxtField);
		
		contentPane.add(btnSubmit);
		contentPane.add(btnCancel);
	}	
	
		public static void main(String[] args)
		{
			JFrame login = new LoginFrame();
			login.setTitle("Login");
			login.setSize(350,550);
			login.setLocation(100 ,200);
			login.setLocation(100,200);
			login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			login.setVisible(true);
		}
}
