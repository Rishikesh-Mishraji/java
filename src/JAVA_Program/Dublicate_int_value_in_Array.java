package JAVA_Program;

public class Dublicate_int_value_in_Array {

	public static void main(String[] args) {
		int []arr = {3,5,3,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate number is. "+arr[i]);
				}
				
			}
		}

			}
		
	}


