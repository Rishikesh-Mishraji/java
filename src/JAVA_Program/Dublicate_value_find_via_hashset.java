package JAVA_Program;

import java.util.HashSet;

public class Dublicate_value_find_via_hashset {

	public static void main(String[] args) {
		int [] arr = {3,4,6,5,4,6};
		//HashSet<String> value =new HashSet<String>();
		HashSet<Integer> value = new HashSet<Integer>();
		boolean flag =false;
		for(int i=0;i<arr.length;i++)
			
		{
			if(value.add(arr[i])==false)
			{
				System.out.println("DUblicate value is the: "+arr[i]);
				flag =true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Dublicate value is not present");
		}

	}

}
