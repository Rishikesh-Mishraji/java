package JAVA_Program;

import java.util.Scanner;

public class Prime_number_or_not {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("given the number");
		int num =sc.nextInt();
		int count =0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count =count+1;
				}
			}
			System.out.println("Given no is :"+count);
					if(count==2)
					{
						System.out.println("given num is a prime number");
					}
					else
					{
						System.out.println("given num is not a prime number");
					}
				}
		
		else
		{
			System.out.println("Given number is not a prime number because it is either less than or equal to 1, 0, or negative.");
		}
			
sc.close();
	}

}
