package com.facade;
import java.util.*;

import com.pack.Answer;
public class AnswerList {
	
	List<Answer> alist= new ArrayList();
	
	public void addAns(Answer ans)
	{
		
		
		alist.add(ans);
	}

	public List<Answer> getAll() {
		// TODO Auto-generated method stub
		return alist;
	}

}
