package JAVA_Program;

public class Search_element_present_or_not_what_position_in_array {

	public static void main(String[] args) {
		int []b = {3,5,6,34,5,6,3};
		int search_value = 34;
		boolean flag =false ;
		for(int i=0;i<b.length;i++)
		{
			if(search_value==b[i])
			{
				System.out.println("search value is present at :"+i+" position");
				flag =true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("search value is not present in the array");
		}

	}

}
