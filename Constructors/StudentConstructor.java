import java.lang.String;
import java.lang.System;
public class StudentConstructor
{
	String name;
	int age;
	StudentConstructor(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Name :"+name+"\nAge :"+age);
	}
	public static void main(String... args)
	{
	  StudentConstructor obj = new StudentConstructor("Shanmukha",23);
	  obj.display();
	}
}
