package JAVA_Program;

import java.util.Scanner;

public class Sum_of_digit_in_num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please give me the number");
		int aa =sc.nextInt();
		
		int temp=0;
		while(aa!=0)
		{
			temp= temp+aa%10;
			aa=aa/10;
		}
		System.out.println("sum of the digit count is "+temp);
		sc.close();
				

	}

}
