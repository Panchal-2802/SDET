package encapsulation;

public class Encapsulation {
/* Rules for defining encapsulation:-
 * All variable should be private
 * For every variable their should be two variable one is for assign value & other is for print or fetching outpuy
 * variable can operated only through methods
 * */
	private long accountNum;
	private String UserName;
	private String BankName;
	
	/* Now to create method for assign value (setter) and print value (getter) there are 2 ways
	 * One is create manually just like we create in constructor or overloading flow
	 * Another is go to source at top --> select getter and setter it will directly create for you
	 * */
	public static void main(String[] args) {
		Encapsulation obj1 = new Encapsulation();
		obj1.setAccountNum(1000);
		long actualAccNo = obj1.getAccountNum();
		System.out.println(actualAccNo);

	}

	public long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(long accountNum) { // long accountNum is local variable
		this.accountNum = accountNum; // note:- this keyword always refer to class variable not a local variable
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}
	

}
