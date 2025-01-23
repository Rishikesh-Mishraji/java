package JAVA_Program;
import java.util.*;
public class Random_data_generate {

	public static void main(String[] args) {
		Random random = new Random();
		int num=random.nextInt(5);
		//generating the number between 1 to 5
		System.out.println(num);
		Random random1 = new Random();
		//generating the characters between 1 to 5
		char fdd = (char) ('a' + random1.nextInt(26));
		System.out.println(fdd);
	}
    //RandomStringUtils is a third-party library that we can integrate into our project,
	//and using this, we can generate random digits as well as random strings with the required length
}
