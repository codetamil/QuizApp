package Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	
	List<Employee> empList= new ArrayList<Employee>();
	void addEmployee(Employee emp)
	{
		
		
		empList.add(emp);
		
	}
	
	
	List<Employee> getAllEmployee()
	{
		return empList;
	}
}
