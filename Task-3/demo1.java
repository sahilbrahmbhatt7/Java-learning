// create a program to sum all odd number from 1 to a specified number N(user). 1,3,7,5,9,


import java.util.Scanner;

public class demo1
{
	public static void main(String args[])
	{

	Scanner input = new Scanner(System.in);
	System.out.println("sum of all odd number:");

	System.out.println("enter the number:");

	int num = input.nextInt();
	int sum = oddSum(num);
	System.out.println("oddsum till " + num + " is: " + sum);
	}
	
	public static int  oddSum(int num)
	{
		int sum= 0;

		int i =1;
		while(i<=num)
		{
			sum = sum + i;
			i=i+2;
		}

		return sum;
	}

}

