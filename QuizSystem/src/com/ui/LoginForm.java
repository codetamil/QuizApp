package com.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.dao.UserDao;

public class LoginForm extends JFrame implements ActionListener{
	
	JLabel label1,label2;
	JTextField text1,text2;
	
	JButton button;
	public LoginForm()
	{
		
		setSize(300,300);
		
		label1= new JLabel("Email");
		text1= new JTextField(20);
		
		label2= new JLabel("Password");
		text2=new JTextField(20);
		
	
		button=new JButton("Login");
		
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(button);
		
		button.addActionListener(this);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String username,password,result;
		if(e.getSource()==button)
		{
			
			username=text1.getText();
			password=text2.getText();
			
			//JOptionPane.showMessageDialog(null,"Welcome to Swings"+username);
			
			UserDao TestDao= new UserDao();
			try {
				result=TestDao.validateUser(username, password);
				if (result.equals("success"))
				{
				JOptionPane.showMessageDialog(null,"Successful Login");
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Invalid Login");	
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		
			}
		
			
			
		
		}
		
	}

}
