package Switch_case;

public class FindWeekNames {

	public static void main(String[] args) {
		int Day =7;
	
		// without using break statement
		/*switch(Day) {
		case 1: 
			System.out.println("Monday");
			
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
			
		case 4:
			System.out.println("Thrusday");
			
		case 5:
			System.out.println("Friday");
			
		case 6:
			System.out.println("saturday");
			
		case 7:
			System.out.println("sunday");
			
		default:
			System.out.println("Not entered valid day number");
		}*/
		
		// with using break statement
		switch(Day) {
		case 1: 
			System.out.println("Monday");break;
			
		case 2:
			System.out.println("Tuesday");break;
			
		case 3:
			System.out.println("Wednesday");break;
			
		case 4:
			System.out.println("Thrusday");break;
			
		case 5:
			System.out.println("Friday");break;
			
		case 6:
			System.out.println("saturday");break;
			
		case 7:
			System.out.println("sunday");break;
			
		default:
			System.out.println("Not entered valid day number");
		}
	}

}
