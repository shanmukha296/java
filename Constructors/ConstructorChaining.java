import java.lang.String;
import java.lang.System;
public class ConstructorChaining
{
	String name;
	int id;
	int salary;
	ConstructorChaining()
	{
		this("shanmukha",101);
		System.out.println("Default parameter....");
	}
	ConstructorChaining(String name,int id)
	{
		this(name,id,25000);
		System.out.println("Two parameter constructor");
	}
	ConstructorChaining(String name,int id,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Three paramete constructor");
	}
	void display()
	{
		System.out.println("after constructor Chaining Values Are :");
		System.out.println("Name ="+name+"\nid="+id+"\nSalary="+salary);
	}
	public static void main(String... args)
	{
		ConstructorChaining obj =new ConstructorChaining();
		obj.display();
	}
}
