package JAVA_Program;

public class Fibonacci_sequence {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum =0;
		System.out.print(n1);
		System.out.print(",");
		System.out.print(n2);
		for(int i=0;i<10;i++)
		{
			sum=n1+n2;
			System.out.print(",");
			System.out.print(sum);
			n1=n2;
			n2=sum;
			
		}
			

	}

}
