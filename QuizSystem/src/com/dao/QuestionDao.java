package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.Question;
import com.util.ConnectionUtil;

//Data Access Objects
public class QuestionDao {
	
	Connection con=ConnectionUtil.getConnectToMysql();
	PreparedStatement psmt;
	public void addQuestion(Question question) throws SQLException
	{
		String sql= "insert into questions(id,question_type,question_txt,is_active)"
				+ "values(?,?,?,?)";
		
		psmt=con.prepareStatement(sql);
		
		psmt.setInt(1, question.getId());
		psmt.setString(2, question.getQuestionType());
		psmt.setString(3,question.getQuestionText() );
		psmt.setBoolean(4, question.getIsActive());
		
		psmt.execute();
		
		System.out.println("Successfully inserted");
		
	}
	public void update(Question question) throws SQLException
	{
		String sql= "UPDATE questions SET question_type=?,question_txt=? WHERE id=?";

		
		psmt=con.prepareStatement(sql);
		
		psmt.setString(1, question.getQuestionType());
		psmt.setString(2, question.getQuestionText());
		psmt.setInt(3, question.getId());
		
		psmt.executeUpdate();
		
		System.out.println("Successfully updated");
		
	
	}
	
	public void delete(int id) throws SQLException
	{
		String sql="delete  from questions where id=?";
		
		psmt=con.prepareStatement(sql);
		
		psmt.setInt(1, id);
		
		psmt.executeUpdate();
		System.out.println("Succesfully deleted");
	}
	
	public void getAllQuestions(Question question) throws SQLException
	{
		String sql="select * from questions where id IN (?,?)";
		
		psmt=con.prepareStatement(sql);
		
		psmt.setInt(1, question.getId());
		psmt.setInt(2, question.getId());
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "
				//+"    "+rs.getString(2)+"   "
		+rs.getString(3)
			+"   "+rs.getString(4)
					);
		}
		
		
	}
	

}
