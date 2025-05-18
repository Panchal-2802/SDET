package practice_if_else;

public class CompareTwoFloatNumber {

	public static void main(String[] args) {
		float num1 = 25.2416f;
		float num2 = 25.2417f;
		if (num1>num2) {
			System.out.println("The larger Number from both number is num 1 : " + num1);
		}
		else if(num2>num1) {
			System.out.println("The larger Number from both number is num 2 : " + num2);
	}
		else {
			System.out.println("Both numbers are equal: " + num1);
		}
	}
}