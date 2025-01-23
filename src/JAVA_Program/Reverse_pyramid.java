package JAVA_Program;

public class Reverse_pyramid {

	public static void main(String[] args) {
		for(int k=1;k<5;k++)
		{
			for(int l=1;l<k;l++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<5-k;l++)
			{
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}

	}

}
