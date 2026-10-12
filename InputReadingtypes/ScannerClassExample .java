import java.util.Scanner;
import java.lang.String;
import java.lang.System;
public class ScannerClassExample
{
	static void display(String name,int roll,double marks,boolean status)
	{
		System.out.println("Student name "+name);
		System.out.println("Roll No= "+roll);
		System.out.println("Marks ="+marks);
		System.out.println("Pass Status="+status);
	}
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Student name\n ");
	    String name =sc.nextLine();
	    System.out.println("Enter roll no\n");
	    int roll=sc.nextInt();
	    System.out.println("Enter Student Marks \n");
 	    double marks=sc.nextDouble();
	    System.out.println("Student pass status \n");
        boolean status=sc.nextBoolean();
        System.out.println("******Display Details********");
        display(name,roll,marks,status);
	}
}
