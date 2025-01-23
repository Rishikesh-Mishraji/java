package JAVA_Program;

import java.util.Scanner;

public class Swaping_two_no_with_third_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the  first number");
		int first_num = sc.nextInt();
		System.out.println("Please enter the  Second number");
		int Second_num = sc.nextInt();
		int a=first_num;
		int b=Second_num;
		int temp=0;
		temp =a;
		a=b;
		b=temp;
		System.out.println("Now the first number change to "+a);
		System.out.println("Now the second number change to "+b);
		sc.close();
	}

}
