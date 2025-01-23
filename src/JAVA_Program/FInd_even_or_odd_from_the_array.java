package JAVA_Program;

public class FInd_even_or_odd_from_the_array {

	public static void main(String[] args) {
		int []b = {3,5,6,8,9,13,53,64,34};
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				even_count=even_count+1;
				
				System.out.println("Even numbers "+b[i]);
			}
			else
			{
				odd_count=odd_count+1;
				System.out.println("Odd numbers "+b[i]);
			}
		}
		System.out.println("total even number in the array are  "+even_count);
		System.out.println("total odd number in the array are  "+odd_count);

	}

}
