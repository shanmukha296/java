import java.lang.String;
import java.lang.System;
class Employee
{
	void calculateSalary()
	{
		System.out.println("Employee basic salary = 15000");
	}
}
class Manager extends Employee
{
	@Override
	void calculateSalary()
	{
		System.out.println("Manager basic salary = 40000");
	}
}
class Developer extends Employee
{
	@Override
	void calculateSalary()
	{
		System.out.println("Developer basic salary = 60000");
	}
}
public class SalarySystemMethodOverriding
{

	public static void main(String... args)
	{
		Manager m=new Manager();
		m.calculateSalary();
		Developer d= new Developer();
		d.calculateSalary();
	}
}
