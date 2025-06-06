package encapsulation;

public class Encapsulation2 {

	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		obj1.setAccountNum(151120106050l);
		long AccountNum = obj1.getAccountNum();
		System.out.println("The account number is : " + AccountNum);
		
		obj1.setBankName("State Bank Of India");
		String ActualBankName = obj1.getBankName();
		System.out.println("The acutual bank name : " + ActualBankName);
		
		obj1.setUserName("Panchal Hardhik");
		String ActualUserName = obj1.getUserName();
		System.out.println("The actual user name : " + ActualUserName);
	}

}
