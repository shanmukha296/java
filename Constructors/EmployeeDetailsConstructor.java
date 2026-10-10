
import java.lang.String;
import java.lang.System;
public class EmployeeDetailsConstructor
{
	String empname;
	int salary;
	
	EmployeeDetailsConstructor()
	{
		System.out.println("Employee Details");
			
	}
	EmployeeDetailsConstructor(String empname,int salary)
	{   this.empname=empname;
	    this.salary=salary;
		System.out.println("Employee Name = "+empname+"\n Salary ="+salary);
		
	}
	public static void main(String... args)
	{
		EmployeeDetailsConstructor obj = new EmployeeDetailsConstructor();
		EmployeeDetailsConstructor emp= new EmployeeDetailsConstructor("Shanmukha rao",34560);
	}
	
}
