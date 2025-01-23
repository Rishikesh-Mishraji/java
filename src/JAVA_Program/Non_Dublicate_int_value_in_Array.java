package JAVA_Program;

public class Non_Dublicate_int_value_in_Array {

	public static void main(String[] args) {
		int [] value = {4,5,6,7,8,8,4};
		for(int a =0;a<value.length;a++)
		{
			boolean vv =false;
			for(int b=0;b<value.length;b++)
			{
				if(a!=b &&value[a]==value[b])
				{
					vv = true;
					break;
				}
				
		}
			 if (!vv) {
	                System.out.println("Non-duplicate number is: " + value[a]);
		}
	}

	}}
