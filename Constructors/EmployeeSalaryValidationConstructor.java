import java.lang.String;
import java.lang.System;
public class EmployeeSalaryValidationConstructor
{
	String name;
	int salary;
	boolean valid;
	EmployeeSalaryValidationConstructor(String name,int salary)
	{   
	    if(salary > 0)
	    {
		    this.name=name;
	     	this.salary=salary;
	     	this.valid=true;
	    }
	    else
	    {
	    	System.out.println("Inavalid Salary");
	    	this.valid=false;
		}
	}
	void display()
	{
		if(valid)
		{
			System.out.println("Employee name="+name+"\nSalary ="+salary);
			
		}
	}
	public static void main(String... args)
	{
		EmployeeSalaryValidationConstructor obj= new EmployeeSalaryValidationConstructor("shanmukha",25000);
		obj.display();
		EmployeeSalaryValidationConstructor obj1=new EmployeeSalaryValidationConstructor("rajarao",-456);
		obj1.display();
	}
}
