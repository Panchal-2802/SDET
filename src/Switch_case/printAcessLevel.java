package Switch_case;

public class printAcessLevel {

	public static void main(String[] args) {
		/*String user_role = "scribe";
		
		switch(user_role) {
		case "Super admin":
			System.out.println("Have a access of full platform like :- create user, delete user etc");break;
		case "Admin":
			System.out.println("Have a limited access like see the list of user and product detail but not delete anything");break;
		case"Shopmanager":
			System.out.println("Can create product and manage the store of woocommerce");break;
		case"Affiliate":
			System.out.println("Can create coupon on platform");break;
			default:
				System.out.println("Invalid user role");
		}*/
		
		String role = "admin";
		role = role.toLowerCase(); // explicitly converting into lowercase
		switch(role) {
		case "Super admin":
			System.out.println("Have a access of full platform like :- create user, delete user etc");break;
		case "admin":
			System.out.println("Have a limited access like see the list of user and product detail but not delete anything");break;
		case"Shopmanager":
			System.out.println("Can create product and manage the store of woocommerce");break;
		case"Affiliate":
			System.out.println("Can create coupon on platform");break;
			default:
				System.out.println("Invalid user role");
		}

	}

}
