package JAVA_Program;

import java.util.Scanner;

public class Swaping_two_number_without_third_variable {

	public static void main(String[] args) {
	
		Scanner ss = new Scanner(System.in);
		System.out.println("Please enter first number");
		int x =ss.nextInt();
		System.out.println("Please enter second number");
		int y =ss.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Now the first number is change to "+x);
		System.out.println("Now the second number is change to "+y);
		ss.close();
 
	}

}
