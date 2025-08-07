import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.util.Arrays;
class TruckLoading
{
	static void load(int n,int cap,int arr[])
	{
		Arrays.sort(arr);
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==cap )
				{
					System.out.print("[ "+arr[i]+","+arr[j]+"]\n");
					c++;
				}
			}
		}System.out.println("total trucks"+c);
		
	}
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size for packages");
		int n=s.nextInt();
		System.out.println("enter the truck capacity");
		int truckC=s.nextInt();
		System.out.println("enter weight for pacakages");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	    load(n,truckC,arr);
		
	}
  
}
