package Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dao.AnswerDao;
import com.dao.QuestionDao;
import com.facade.AnswerList;
import com.facade.QuestionList;
import com.pack.Answer;
import com.pack.Question;
import com.util.ConnectionUtil;

public class Mainz {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Employee emp= new Employee();
		
		emp.setId(20);
		emp.setName("XXX");
		//System.out.println(emp);
		Employee emp1= new Employee();
		emp1.setId(21);
		emp1.setName("yyy");
		//System.out.println(emp1);
		
		EmployeeList el=new EmployeeList();
		el.addEmployee(emp);
		el.addEmployee(emp1);
		
		List<Employee> empList=el.getAllEmployee();
		
		Iterator<Employee> ii=empList.iterator();
		
		while(ii.hasNext())
		{
			Employee ee=ii.next();
			System.out.println(ee.getId()+" "+ee.getName());
		}
		*/
		
		// TODO Auto-generated method stub
		
		
	/*	Question q1= new Question();
		q1.setId(100);
		q1.setQuestionType("Multiple Choice");
		q1.setQuestionText("What is java?");
		q1.setIsActive(true);
		
		
		Question q2= new Question();
		
		q2.setId(101);
		q2.setQuestionType("Paragraph");
		q2.setQuestionText("what is an Operator");
		q2.setIsActive(true);
		
		
		QuestionList qList= new QuestionList();
		
		qList.addQuestions(q1);
		
		qList.addQuestions(q2);
		
		
		System.out.println(qList.getAll());
		
		List<Question> dummy= qList.getAll();
		
		Iterator ii= dummy.iterator();
		
		while(ii.hasNext())
		{
			Question q= (Question)ii.next();
			System.out.println(q);
		}
		
*//*   Answer ans=new Answer();
 
		
		ans.setId(1);
		ans.setAnswerText("java");
		ans.setCorrectAnswer("java  is pgm lang");
		
		AnswerList obj=new AnswerList();
		obj.addAns(ans);*/
		
		
	/*	ConnectionUtil cc= new ConnectionUtil();
		cc.getConnectToMysql();*/
		
		
		/*Question q1= new Question();
		q1.setId(101);
		q1.setQuestionType("Multiple choice");
		q1.setQuestionText("What are Variables?");
		q1.setIsActive(true);
		Question q2= new Question();
		q2.setId(105);
		q2.setQuestionType("Paragraph");
		q1.setQuestionText("What are Var?");
		q1.setIsActive(true);
		Question q3= new Question();
		q1.setId(106);
		q1.setQuestionType("Multiple choice");
		q1.setQuestionText("What are Variables?");
		q1.setIsActive(true);
		
		QuestionDao questiondao= new QuestionDao();
		//questiondao.updateQuestion(q2);
		
		//questiondao.delete(105);
		//questiondao.delete(106);*/
		
		
		/*Question q7= new Question();
		q7.setId(107);
		q7.setQuestionType("mcq");
		q7.setQuestionText("what is method?");
		q7.setIsActive(false);*/
		//gk.addQuestion(q7);
		
		
		/*Question q8= new Question();
		q8.setId(104);
		q8.setQuestionType("one ");
		q8.setQuestionText("what is name ");
		//q8.setIsActive(false);
		//gk.addQuestion(q8);
		gk.update(q8);*/
		Scanner g=new Scanner(System.in);
		System.out.println("enter the id to view data");
		int x=g.nextInt();
		int y=g.nextInt();
		Question q= new Question();
		Question q1= new Question();
	QuestionDao gk= new QuestionDao();
		q.setId(x);
		q1.setId(y);
		//q.setQuestionType("Paragraph" );
		//q.setQuestionText("Explain JDBC" );
		//q.setIsActive(true);
		gk.getAllQuestions(q);
		
	//	gk.getAllQuestions();
		
	//	gk.delete(104);
		
		//Answer ans= new Answer();
		
		//ans.setId(2);
		//ans.setAnswerText("Java Database connectivity");
		//ans.setCorrectAnswer("hiii ");
		// gk = new AnswerDao();
		//gk.update(ans);

		//.setQuestion(q);
		//ans.toString();
		//System.out.println(ans.toString());
		
		//AnswerDao gk = new AnswerDao();
		//answerdao.addAnswer(ans);
		//answerdao.getallanswer();
		//gk.delete(1);
		
	}

}
