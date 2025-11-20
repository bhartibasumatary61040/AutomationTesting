package switchcase;

import java.util.Scanner;

public class StringCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0;
		do {
			System.out.println("Enter choice ");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.next();
			
			switch(choice) {
			case "Add","Addition":
				System.out.println("Addition");
			break;
			case "sub":
			System.out.println("substraction");
			break;
			default:
				System.out.println("default");
			}
			i++;
			
			}while(i<2);
		}

	}


