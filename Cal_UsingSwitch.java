package Task;

import java.util.Scanner;

public class Cal_UsingSwitch {

	public static void main(String[] args) {
		

		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			
		
		System.out.println("Enter the first number:");
		double n1=scanner.nextDouble();
		
		System.out.println("Enter the Second number:");
		double n2=scanner.nextDouble();
		
		
		System.out.println(" add - Addition \n sub - Subtraction \n mul - Multiplaction \n div - Division \n exit - Stop Operations");
		System.out.println("Choose the Operation :");
		String choice=scanner.next();
		
		String c =choice.toLowerCase();
		
		switch (c) {
		case "add": {
			System.out.println("Addition = "+(n1+n2));
			break;
		}
		case "sub": {
			System.out.println("Subtraction = "+(n1-n2));
			break;
		}
		case "mul": {
			System.out.println("Multiplaction = "+(n1*n2));
			break;
		}
		case "div": {
			System.out.println("division = "+(n1/n2));
			break;
		}
		case "exit": {
			System.exit(0);
			break;
		}
		
		default:
			System.out.println("Please choose correct Operation");
		}
		
		
		
		}
	}
}
