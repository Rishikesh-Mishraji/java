package JAVA_Program;

public class pyramid_star_pattern {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("V ");
			}
			System.out.println(" ");
		}
	}

}
