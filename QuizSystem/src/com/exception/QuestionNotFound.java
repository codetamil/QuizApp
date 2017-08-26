package com.exception;
//creating your own Exception
public class QuestionNotFound extends Exception {
	
	//Constructor
	public QuestionNotFound(String msg)
	{
		System.out.println(msg);
	}

}
