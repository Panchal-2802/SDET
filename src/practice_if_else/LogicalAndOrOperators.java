package practice_if_else;

public class LogicalAndOrOperators {
	
	/* A user can access an online banking portal only if they are logged in and their session is not expired. Demonstrate the use of logical AND (&&) to check this. 
	Also, show how logical OR (||) can be used to display a warning if either the password is incorrect or the account is locked.*/
	
	public static void main(String[] args) {
		// user status
		boolean user_loggedIn = true;
		boolean Session_active = false;
		if(user_loggedIn && Session_active) {
			System.out.println("A user can access the banking portal");
		}
		else {
			System.out.println("Hence user can't access either it not logged in or session has been expired");
		}
		// security status
		boolean correct_password = false;
		boolean account_locked = false;
		if (!correct_password || account_locked) {
			System.out.println("User cannot access the banking portal due to incorrect password or account locked");
		}
		else {
			System.out.println(" Credential are valid : user can access banking portal");
		}

	}

}
