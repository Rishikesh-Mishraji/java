package JAVA_Program;

public class Right_pyramid {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");	
		}
		for(int k=0;k<5;k++)
		{
			for(int a=0;a<5-k;a++)
			{
				System.out.print("*");	
			}
			System.out.println("");
			
		}

	}

}
