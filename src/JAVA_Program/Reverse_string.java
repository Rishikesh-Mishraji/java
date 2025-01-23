package JAVA_Program;

public class Reverse_string {

	public static void main(String[] args) {
		String str= "Rishikesh";
		String temp ="";
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			char aa =str.charAt(str.length()-1-i);
			temp=temp+aa;
		}
    System.out.println(temp);
	}

}
