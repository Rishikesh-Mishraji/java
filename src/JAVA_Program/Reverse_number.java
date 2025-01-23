package JAVA_Program;

public class Reverse_number {

	public static void main(String[] args) {
		int i=4567824;
		int temp=0;
		while(i!=0)
		{
			int value =(i%10);
			temp =(temp*10)+value;
			i=i/10;
		}
		System.out.println(temp);

	}

}
