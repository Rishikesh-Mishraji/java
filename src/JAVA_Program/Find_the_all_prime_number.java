package JAVA_Program;

import java.util.Scanner;

public class Find_the_all_prime_number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.print("Please give me the number");
		int num =sc.nextInt();
		System.out.println("Prime numbers between 1 and " + num + " are:");
        
		for(int i=2;i<=num;i++)
		{
			 int count = 0;
			for(int j=1;j<=i;j++)
		    {
		    	if(i%j==0)
		    	{
		    		count =count +1;
		    	}			
		    }	
			if(count==2)
			{
				System.out.println(i);
			}	
		}
	    sc.close();

	}

}
