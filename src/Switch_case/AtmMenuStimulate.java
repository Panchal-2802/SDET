package Switch_case;

import java.util.Scanner;

public class AtmMenuStimulate {

	public static void main(String[] args) {
		String ATM_menu = "Check Balance";
		
		switch(ATM_menu) {
		
		case "Check Balance":
			System.out.println("You have a sufficient balance to withdraw");break;
		case "Withdrawal":
			System.out.println("Your amount withdraw sucessfully");break;
		case "Exit":
			System.out.println("Take out your card and exit ");break;
			default:
				System.out.println("Not selected valid menu option");
		}
	
		// user input code 
/*Scanner sc = new Scanner(System.in);
		
		System.out.println("ATM Menu:");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Exit");
		System.out.print("Enter your choice: ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("You have a sufficient balance to withdraw.");
				break;
			case 2:
				System.out.println("Your amount was withdrawn successfully.");
				break;
			case 3:
				System.out.println("Take out your card and exit.");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
		}
		
		sc.close();*/
	}

	}


