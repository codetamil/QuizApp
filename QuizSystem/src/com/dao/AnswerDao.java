package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.Answer;
import com.util.ConnectionUtil;

public class AnswerDao {
	
	
	Connection con=ConnectionUtil.getConnectToMysql();
	PreparedStatement psmt;
	
	public void addAnswer(Answer answer) throws SQLException
	{
		
		String sql= "insert into answer(id,answer_text,correct_answer,q_id)"
				+ "values(?,?,?,?)";
		
		
		psmt=con.prepareStatement(sql);
		
		psmt.setInt(1, answer.getId());
		psmt.setString(2, answer.getAnswerText());
		psmt.setString(3, answer.getCorrectAnswer());
		psmt.setInt(4, answer.getQuestion().getId());
		
		psmt.execute();
		System.out.println("Successfully inserted");
	}
	public void update(Answer gk ) throws SQLException
	{
		String sql= "UPDATE answer SET correct_Answer=? where id=?";
		psmt=con.prepareStatement(sql);
		psmt.setString(1, gk.getCorrectAnswer());
		psmt.setInt(2, gk.getId());
		psmt.executeUpdate();
	}
	
	public void delete(int id) throws SQLException
	{
		String sql="delete  from answer where id=?";
		
		psmt=con.prepareStatement(sql);
		
		psmt.setInt(1, id);
		
		psmt.executeUpdate();
		System.out.println("Succesfully deleted");
	}
	public void getallanswer() throws SQLException
	{
       String sql="select * from answer";
		
		psmt=con.prepareStatement(sql);
		
		ResultSet rs=psmt.executeQuery();	
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "
		+rs.getString(3)
			+"   "+rs.getInt(4)
					);
		}
	}

}
