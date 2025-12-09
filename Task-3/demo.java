// develop a program that prints the multiplication table for given number. 4*1=4......

import java.util.Scanner;

public class demo
{
	public static void main(String args[])
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("welcome to MultiplicationTable:\n");
		System.out.print("please enter the number:-");
		int num = Scanner.nextInt();
		printMultiplicationTable(num);

	}
	public static void printMultiplicationTable(int num)

	{
		int i =1;
		while(i<=10)
		{
			System.out.println(num + " X " +  i + "=" +  (num*i)); 
			i++;
		}


	}
}