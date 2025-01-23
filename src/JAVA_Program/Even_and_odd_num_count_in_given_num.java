package JAVA_Program;

import java.util.Scanner;

public class Even_and_odd_num_count_in_given_num {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("please give me the nummber");
		int aa =ss.nextInt();
		int even_count=0;
		int odd_count=0;
		int temp=0;
		while(aa!=0)
		{
			temp =aa%10;
			if(temp%2==0)
			{
				even_count=even_count+1;
			}
			else
			{
				odd_count=odd_count+1;
			}
			aa=aa/10;
		
		}
		System.out.println("No of the even_count is "+even_count);
		System.out.println("No of the odd_count is "+odd_count);
		ss.close();

	}

}
