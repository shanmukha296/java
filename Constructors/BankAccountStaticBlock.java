import java.lang.String;
import java.lang.System;
public class BankAccountStaticBlock
{
	static String bankname;
	String holder;
	String number;
	
	static
	{
        bankname="State bank of India";
		System.out.println("Static block Executed");
	}
	{
	 System.out.println("INstance block Executed");
	}
	BankAccountStaticBlock(String holder,String number)
	{
		this.holder=holder;
		this.number=number;
	}
	void Display()
	{
	System.out.println("Accounnt Holder ="+holder+"\nAcc Number="+number);
	System.out.println("Bank name ="+bankname);
	}
	public static void main(String... args)
	{
		BankAccountStaticBlock obj=new BankAccountStaticBlock("shannu","356222191271");
		obj.Display();
		BankAccountStaticBlock obj1=new BankAccountStaticBlock("sandyy","27921636237");
		obj1.Display();
	    BankAccountStaticBlock obj2=new BankAccountStaticBlock("vinodh","1018383817319");
		obj2.Display();
	}
	
}
