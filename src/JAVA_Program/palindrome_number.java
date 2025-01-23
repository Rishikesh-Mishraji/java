package JAVA_Program;
import java.util.Scanner;
public class palindrome_number {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int temp =0;
        
        while(number!=0)
        {
        	int value =number%10;
        	temp=temp*10+value;
        	number =number/10;
        }
        System.out.println(temp);
        if(temp==originalNumber)
        {
        	System.out.println("Givern number is a palindrome ");
        }
        else
        {
        	System.out.println("Givern number is not a palindrome");
	}
        scanner.close();
	}
	

}
