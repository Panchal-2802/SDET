package practice_if_else;

public class CheckAge {

	public static void main(String[] args) {
		int Age = 17;
		if (Age >=13 && Age <= 19) {
			System.out.println("The entered age defined as a teen : " + Age );
		}
		else if (Age>=18 && Age < 60) {
			System.out.println("The entered age defined as a adult : " + Age);
		}
		else if(Age>=60){
			System.out.println("The entered age is define as senior citizen : " + Age);
		}
		else {
			System.out.println("The entered age is define as a child : " + Age);
		}

	}

}
