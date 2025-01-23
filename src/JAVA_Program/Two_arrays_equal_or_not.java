package JAVA_Program;

import java.util.Arrays;

public class Two_arrays_equal_or_not {

	public static void main(String[] args) {
		int [] arr1= {4,6,7,5,7,5,10};
		int [] arr2 ={4,6,8,5,7,5,10};
		
		boolean bb=Arrays.equals(arr1, arr2);
		if(bb==true)
		{
			System.out.println("Both the arrays are equals");
		}
		else
		{
			System.out.println("Both the arrays are Not equals");
		}


	}

}
