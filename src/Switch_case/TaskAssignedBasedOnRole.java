package Switch_case;

public class TaskAssignedBasedOnRole {

	public static void main(String[] args) {
		String user_role = "Scribe";
		
		switch(user_role) {
		case "Admin":
			System.out.println( user_role + " : Please delete all user data from admin panel");break;
		case "Developer":
			System.out.println(user_role + " : Build signup functionality for singup");break;
		case "Manager":
			System.out.println(user_role + " : Create a documentation of build developed till last week");break;
		case "Tester":
			System.out.println(user_role + " : Test functionalty after the function built by developer");break;
			
		default:
			System.out.println(user_role + " : Entered role is not valid in this project");
		}

	}

}
