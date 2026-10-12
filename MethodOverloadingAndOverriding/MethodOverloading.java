import java.lang.String;
import java.lang.System;
public class MethodOverloading
{
	void add(int a,int b)
	{
		System.out.println(" Sum="+(a+b));
	}
	int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	String add(String fname,String lname)
	{
		return (fname+lname);
	}
	public static void main(String... args)
	{
	   MethodOverloading obj = new MethodOverloading();
	   obj.add(10,20);
	   System.out.println("3 var Sum="+obj.add(10,20,30));
	   System.out.println("String ="+obj.add("shanmukha"," Rao"));
	   	
	}
	
}
