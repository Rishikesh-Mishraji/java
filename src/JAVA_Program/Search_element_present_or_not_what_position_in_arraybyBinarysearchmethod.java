package JAVA_Program;

import java.util.Arrays;

public class Search_element_present_or_not_what_position_in_arraybyBinarysearchmethod {

	public static void main(String[] args) {
		int []b = {3,5,6,34,5,6,3};
		int search_value = 5454;
	    Arrays.sort(b);
	     int index= Arrays.binarySearch(b,search_value);
	    if (index >= 0) {
            System.out.println("Element " + search_value + " found at index " + index);
        } else {
            System.out.println("Element " + search_value + " not found.");
        }
	
	}
}
// for using the binary search method first we need to sort the array and that method return the index value if that value present in the array otherwise give nagative value 