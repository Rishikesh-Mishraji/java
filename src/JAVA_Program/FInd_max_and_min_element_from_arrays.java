package JAVA_Program;

public class FInd_max_and_min_element_from_arrays {

	public static void main(String[] args) {
		int []a = {3,5,2,5,65,64,444,4354};
		int max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
System.out.println("Maximum value of the array is :"+max);

 int min=a[0];
 
 for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
System.out.println("Minmum value of the array is :"+min);




	}

}
