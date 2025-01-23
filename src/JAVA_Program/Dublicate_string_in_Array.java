package JAVA_Program;

public class Dublicate_string_in_Array {

	public static void main(String[] args) {
	 String [] aaa= {"Rishi","Rishikesh","Ram"};
	  boolean flag =false;
	  
	 for(int i=0;i<aaa.length;i++)
	 {
		 for(int j=i+1;j<aaa.length;j++)
		 {
			 if(aaa[i].equals(aaa[j]))
			 {
			 System.out.println("Dublicate value from the array : "+aaa[i]);
			 flag=true;
			 }
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("There is no dublicate value in the given array");
	 }
	 
	}

}
