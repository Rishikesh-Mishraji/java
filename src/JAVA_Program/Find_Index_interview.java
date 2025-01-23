package JAVA_Program;

public class Find_Index_interview {

	public static void main(String[] args) {
	 int [] b= {2,5,6,5,6,7};
	 int sum =13;
	 
	 
	 //find the index number so we will get the sum of if we add the value

	 
	 for(int i=0;i<b.length-1;i++)
	 {
		 for(int j=i+1;j<b.length;j++)
		 {
			 int total =b[i]+b[j];
			
				if(sum==total)
						 {
					 System.out.println("index value is "+i+" and other index is "+j);

		 }
		 				 }
	 }
	}

}