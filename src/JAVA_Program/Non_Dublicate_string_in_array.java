package JAVA_Program;

public class Non_Dublicate_string_in_array {

	public static void main(String[] args) {
		String [] aaa= {"Rishi","Rishikesh","Ram","Rishi"};
		for(int i=0;i<aaa.length;i++)
		{
			boolean value =false;
			for(int j=0;j<aaa.length;j++)
			{
				if(i!=j&& aaa[i].equals(aaa[j]))
				{
					value =true;
					break;
				}
			}
			if(!value)
			{
				System.out.println("non dublicate value is :"+aaa[i]);
			}
			
		}

	}

}
