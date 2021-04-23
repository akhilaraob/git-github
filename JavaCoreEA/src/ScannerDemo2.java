
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		int age;
		String name;
		String address;
		
		Scanner myin=new Scanner(System.in);
		System.out.println("Enter yourAge");
		age=myin.nextInt();
		System.out.println("Enter your Name");
		name=myin.next();
		System.out.println("Enter your Address");
		address=myin.next();
				
		
		System.out.println("Your Name is  :"+name);
		System.out.println("Your Age is  :"+age);
		System.out.println("Your Address is :"+address);
		
	}

}
