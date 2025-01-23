package JAVA_Program;

import java.util.Scanner;

public class Find_bigger_num_among_three {

	public static void main(String[] args) {
		Scanner ss =new Scanner(System.in);
		System.out.println("Enter the first number");
		int bb1 =ss.nextInt();
		System.out.println("Enter the second number");
		int bb2 =ss.nextInt();
		System.out.println("Enter the third number");
		int bb3 =ss.nextInt();
if(bb1>bb2&&bb1>bb3)
{
	System.out.println("The first number is the largest number:"+bb1);
}
else if(bb2>bb3&&bb2>bb1)
{   System.out.println("The Second number is the largest number."+bb2);
	}
else
{System.out.println("The Third number is the largest number."+bb3);
	}
ss.close();
	}

}
