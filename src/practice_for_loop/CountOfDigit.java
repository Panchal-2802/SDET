package practice_for_loop;

public class CountOfDigit {

	public static void main(String[] args) {
		int count =0;
		int digit = 123456;
		for(int i=digit; i!=0; i=i/10) {
			count++;// count = count +1 = 0+1=1
			        //1+1=2
			        //2+1=3
			        //3+1=4
			        //4+1=5
			        //5+1=6
			
		}//123456/10 =12345
		 //12345/10=1234
		 //1234/10=123
		 //123/10=12
		//12/10=1
		//1/10=0
		System.out.println(count);

	}

}
