import java.lang.String;
import java.lang.System;
class Person
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class EmployeeConstructor extends Person
{
	int salary;
	Employee()
	{
		this(25000);
	}
	Employee(int salary)
	{
		super("Shanmukha",23);
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name ="+name+"\nAge="+age+"\nSalary="+salary);
	}
	public static void main(String... args)
	{
		Employee emp=new Employee();
		emp.display();
	}
}
