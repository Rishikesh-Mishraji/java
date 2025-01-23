//All the elements in the array should be within the specified range, 
//and no duplicate elements are allowed in the array. 
//Only one unique element should be detected.



package JAVA_Program;

public class find_missing_element_in_array {

	public static void main(String[] args) {
		int []b = {1,2,3,4,5,7};
		int sum1 =0;
		int sum2 =0;
	int	firstele=b[0];
	int	lastnum =b[b.length-1];
		for(int i=0;i<b.length;i++)
		{
			sum1=sum1+b[i];
		
		}
System.out.println("Total sum of the elements in the given array is "+sum1);

sum2 = ((lastnum * (lastnum + 1)) / 2)-((firstele*(firstele-1))/2);
System.out.println("Total sum of from first ele till last ele is "+sum2);



int missing =sum2-sum1;
System.out.println("missing number in the array is "+missing);
	}

	}
