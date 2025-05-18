package practice_for_loop;

public class SumOfDigit {

	public static void main(String[] args) {
		int digit=123;
		int sum =0;
		for(int i=digit; i!=0; i=i/10 ) {
			int last_digit = i%10;//123/10=3(remainder)
			                      //12%10=2 
			                      //1%10=1
			sum+=last_digit;//sum= sum+last_digit
			                //       0+3=3	
			                //       3+2=5
			                //       5+1=6
		}//i/10 = 123/10 = 12
		 //i/10 = 12/10 = 1
		System.out.println("The sum of digit : " + sum);
		
	

	}

}
