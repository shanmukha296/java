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
public class StudentManagementSystemConstructors extends Person
{
	int rollno;
	StudentManagementSystemConstructors()
	{
		this(583);
	}
	StudentManagementSystemConstructors(int rollno)
	{
		this(rollno,"Shanmukha",23);
	}
	StudentManagementSystemConstructors(int rollno,String name,int age)
	{
		super(name,age);

		this.rollno=rollno;
	}
	void display()
	{
		System.out.println("Name ="+name+"\nAge="+age+"\nRoll no ="+rollno);
	}
	public static void main(String... args)
	{
		StudentManagementSystemConstructors obj =new StudentManagementSystemConstructors();
		obj.display();
		StudentManagementSystemConstructors obj1=new StudentManagementSystemConstructors(345);
		obj1.display();
		StudentManagementSystemConstructors obj2=new StudentManagementSystemConstructors(678,"Ravi",19);
		obj2.display();
	}
}
