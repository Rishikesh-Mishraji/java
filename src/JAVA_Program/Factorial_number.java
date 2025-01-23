package JAVA_Program;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("please provide the number");
		int num =ss.nextInt();
		long factorial =1;
		for(int i=1;i<=num;i++)
		{
			factorial =factorial*i;
		}
System.out.println("Factorial of the given number is :"+factorial);
ss.close();
	}


}
