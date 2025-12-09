// write a function calculates factorial of number..0!=1,2!=1*2...

import java.util.Scanner;

public class demo3
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("calculates factorial number:");
		System.out.println("enter your number:-");
		int num  = input.nextInt();
		
		long fact = factorial(num);
		System.out.println("factorial is : " + fact);
	}
	public static long factorial(int num)
	{
		if(num<2)
		{
			return 1;
		}
		long fact = 1;
		int i = 2;
		while(i<=num)
		{
			fact *= i;
			i++;

		}
		return fact ;
	} 
}