package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.Question;
import com.ui.LoginForm;
import com.util.ConnectionUtil;

public class UserDao 
{
	
	Connection con=ConnectionUtil.getConnectToMysql();
	PreparedStatement psmt;
	public String validateUser( String email, String password) throws SQLException
	{
		String sql="select email,password from register where email=? and password=?";
		
		psmt=con.prepareStatement(sql);
		
		psmt.setString(1,email);
		psmt.setString(2,password);
		ResultSet rs=psmt.executeQuery();
		if(rs.next())
		{
		System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
		return "success";
		}
		else
		{
			System.out.println("Invalid login");
			return "Failure";
		}
		}
	}
		

	


