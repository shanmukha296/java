
import java.lang.String;
import java.lang.System;
public class BankAccountConstructor
{
	String accholder;
	double balance;
	BankAccountConstructor(String accholder,double balance)
	{
		this.accholder=accholder;
		this.balance=balance;
	}
	void display()
	{
		System.out.println("Account Holder Name ="+accholder+"\nBalance ="+balance);
	}
    public static void main(String... args)
    {
	BankAccountConstructor bac=new BankAccountConstructor("Shanmukha",339123.2308);
	bac.display();
	System.out.println("\n");
	BankAccountConstructor bac1=new BankAccountConstructor("Pavan",912233.21323);
	bac1.display();
    }
}
