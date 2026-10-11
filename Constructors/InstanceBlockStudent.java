import java.lang.String;
import java.lang.System;
public class StudentBlock
{
	String name;
	int roll;
	{
		System.out.println("Instance Block Executed !");
	}
	StudentBlock(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	void display()
	{
		System.out.println("Student Name ="+name+"\nRoll No ="+roll);
	}
	public static void main(String... args)
	{
	   	StudentBlock obj=new StudentBlock("Shannmukha",101);
	   	obj.display();
	   	StudentBlock obj1 = new StudentBlock("Sandy",102);
	   	obj1.display();
	   	StudentBlock obj2=new StudentBlock("Pavan",103);
	   	obj2.display();
	}
}
