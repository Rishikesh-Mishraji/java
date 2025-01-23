package JAVA_Program;

import java.util.Arrays;

public class Search_ele_by_binary_search {
public static void main(String[]arg)
{
	int [] b= {3,5,6,3,6,74,64,74};
	Arrays.sort(b);

    boolean flag =false;
  
    int key =75;
	int l=0;
	int h=b.length-1;
	
	while(l<=h)
	{
		int m =(l+h)/2;
		if(b[m]==key)
		{
			System.out.println("Element found and that element is at "+m+" position");
			flag= true;
			break;
		}
		else if(b[m]<key)
		{
			l=m+1;
		}
		else if(b[m]>key)
		{
			h=m-1;
		}
		
	}
	if(flag==false)
	{
		System.out.println("Key element is not avaible in the array ");
	}
	}
}