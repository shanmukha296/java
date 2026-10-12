import java.lang.String;
import java.lang.System;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderExample
{

static void display(String name,int roll,double marks,boolean status)
	{
		System.out.println("Student name "+name);
		System.out.println("Roll No= "+roll);
		System.out.println("Marks ="+marks);
		System.out.println("Pass Status="+status);
	}
	public static void main(String... args)throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter Student name\n ");
	    String name =br.readLine();
	    System.out.println("Enter roll no\n");
	    int roll=Integer.parseInt(br.readLine());
	    System.out.println("Enter Student Marks \n");
 	    double marks=Double.parseDouble(br.readLine());
	    System.out.println("Student pass status \n");
      boolean status=Boolean.parseBoolean(br.readLine());
      System.out.println("******Display Details********");
      display(name,roll,marks,status);
	}
}
