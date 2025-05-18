package practice_operators_variabledeclaration_variableassignment;

public class AverageOfFiveNumber {

	public static void main(String[] args) {
		float num1 = 15.5f, num2 = 25.5f, num3 = 45.20f, num4=20.5f, num5 = 10.20f;
		float Sum_of_num = (num1+num3+num2+num4+num5);
		System.out.println("The sum of all num : " + Sum_of_num);
		float Avg_of_num = Sum_of_num/5;
		System.out.println("The average of all num : " + Avg_of_num);

	}

}
