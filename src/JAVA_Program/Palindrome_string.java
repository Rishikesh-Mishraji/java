package JAVA_Program;



public class Palindrome_string {

	public static void main(String[] args) {

	   String aa ="RARA";
		String temp ="";
		String originalvalue =aa;
		
		for(int i=0;i<aa.length();i++)
		{
			char bb=aa.charAt(aa.length()-1-i);
			temp=temp+bb;
		}
		System.out.println("Value of the temp is "+temp);
		if(temp.equals(originalvalue))
		{
			System.out.println("GIven string is a palindrom string");
		}
		else
			System.out.println("GIven string is not a palindrom string");
	}

}
