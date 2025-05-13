package practice_if_else;

public class checkTemperature {
	//Cold (<15), Warm (15–30), or Hot (>30).
	public static void main(String[] args) {
		int temp = 32;
		if (temp < 15) {
			System.out.println("The temmp is cold : " + temp);
		}
		else if (temp >=15 && temp <=30) {
			System.out.println("The temp is warm : " + temp);
		}
		else  {
			System.out.println("The temp is hot : " + temp);
		}
		
	}

}
