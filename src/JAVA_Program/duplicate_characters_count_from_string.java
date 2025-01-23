package JAVA_Program;

public class duplicate_characters_count_from_string {

	public static void main(String[] args) {
		String str ="Rishikesh";
		char [] c= str.toCharArray();
		int count =0;
		
		for(int i=0;i<c.length;i++)
		{
			
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						System.out.println("duplicate character in the string is : "+c[i]); 
						count=count+1;					}
					
				}
				
			}
			
	
			
		}
		System.out.println("duplicate characters counts in the  string are : "+count);
	}

}
