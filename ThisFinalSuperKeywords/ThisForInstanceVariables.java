import java.lang.String;
import java.lang.System;
public class ThisForInstanceVariables
{
	int a;
	String name;
	ThisForInstanceVariables(String name,int a)
	{
		this.name=name;
		this.a=a;
	}
	void display()
	{
		System.out.println("Name ="+name+"\n A ="+a);
	}
	public static void main(String... args)
	{
		ThisForInstanceVariables obj=new ThisForInstanceVariables("shanmukha",10);
		obj.display();
	}
}
