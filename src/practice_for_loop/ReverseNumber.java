package practice_for_loop;

public class ReverseNumber {

	public static void main(String[] args) {
		int digit = 456789;
		int reversed = 0;
		for(int i = digit; i!=0; i=i/10) {
			int num = i%10;// num = 9
			               // 45678%10=8
			               //4567%10=7
			reversed = reversed * 10 + num; // 0+9 = 9
			                                //9*10+8=98
			                                //98*10+7=980+7=987
		}//i=i/10 = 456789/10 =45678
		         // =45678/10=4567
		         //4567/10=
		System.out.println("Reversed Number : " + reversed);

	}

}
