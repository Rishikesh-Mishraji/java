package JAVA_Program;

public class Sum_of_element_of_array {

	public static void main(String[] args) {
		int []a = {4,6,7,3,9,11};
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum =sum+a[i];
		}
		System.out.println(sum);

	}

}
