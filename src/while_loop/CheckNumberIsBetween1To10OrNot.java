package while_loop;

import java.util.Scanner;

public class CheckNumberIsBetween1To10OrNot {

	public static void main(String[] args) {
		Scanner enter_number = new Scanner(System.in);
		System.out.print("Enter your input here : " );
		int user_input = enter_number.nextInt();
		while(user_input<1 || user_input>10) {
			System.out.println("The number is not between 1 & 10 : " + user_input);
			System.out.print("Please enter again: ");
			 user_input = enter_number.nextInt();
		}
		System.out.println("The number is between 1 & 10 : " + user_input);

	}

}
