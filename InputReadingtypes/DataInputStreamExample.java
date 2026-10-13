import java.io.DataInputStream;
import java.io.IOException;
import java.lang.String;
import java.lang.System;
public class DataInputStreamExample
{
	static void display(int a,float b,double c,String name,char ch)
	{
		System.out.println("Integer="+a+"\nFloat ="+b+"\nDouble ="+c+"\nName ="+name+"\nCharacter="+ch);
	}
	public static void main(String... args) throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter integer value");
		int a=Integer.parseInt(dis.readLine());
		System.out.println("\nEnter float value");
		float b=Float.parseFloat(dis.readLine());
		System.out.println("\nEnter double value");
		double c=Double.parseDouble(dis.readLine());
		System.out.println("\nEnter String");
		String name=dis.readLine();
		System.out.println("Enter character");
		char ch =dis.readLine().charAt(0);
        display(a,b,c,name,ch);
		
	}
}
