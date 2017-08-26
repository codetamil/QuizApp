package com.facade;

import java.util.*;

import com.exception.QuestionNotFound;
import com.pack.Question;

public class QuestionList {
	
	List<Question> qList= new ArrayList();
	public List<Question> getAll() throws QuestionNotFound 
	{
		if(qList.isEmpty())
			
			throw new QuestionNotFound("Questions are not available in the list");
		return qList;
		
		
	}
	
	public void addQuestions(Question ques)
	{
		
		
		qList.add(ques);
	}

}
