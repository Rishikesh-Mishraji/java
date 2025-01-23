package JAVA_Program;

public class Left_pyramid {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=1;m<5;m++)
		{
			for(int l=0;l<m;l++)
			{
			System.out.print(" ");
			}
			for(int r=0;r<4-m;r++)
			{
				System.out.print("*");	
			}
			System.out.println("");
		}

	}

}
