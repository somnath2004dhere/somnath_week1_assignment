package Task;

import java.util.Scanner;

public class EvenOdd_Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num=scanner.nextInt();
		
		if (num % 2==0) {
			
			System.out.println(num+" is even number");
		}
		else {
			System.out.println(num+" is odd number");
		}
	}
}
