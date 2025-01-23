package JAVA_Program;

import java.util.Scanner;

public class Count_Digit_of_the_given_num {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Please add the number");
				int ab =ss.nextInt();
				int num =ab;
				int a =0;
				int count =0;
				while(num!=0)
				{
					 a =a+num%10;
					count= count+1;
					num=num/10;
				}
				System.out.println("no of the digit count is :"+count);
                ss.close();
	}

}
