package JAVA_Program;

import java.util.Arrays;

public class Bubble_shot_assending_order {

	public static void main(String[] args) {
		int [] a ={11,13,2,3,10,4,9,5,6,7,8};
		System.out.println("array before shoting "+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("array after shoting "+Arrays.toString(a));
	}

}
