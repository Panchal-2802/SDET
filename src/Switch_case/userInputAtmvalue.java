package Switch_case;

import java.util.Scanner;

public class userInputAtmvalue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
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

        } while (choice != 3);

        sc.close();

	}

}
