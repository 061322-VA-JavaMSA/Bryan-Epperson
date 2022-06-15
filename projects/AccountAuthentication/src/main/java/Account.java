
import java.util.Scanner;

public class Account {
	
	String[] usernames;
	String[] passwords;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void createAccount() {
		System.out.println("Please enter an username!");
		String userInput = scan.nextLine();
		if(userInput != null) {
			
			// append to an array of users!
		}
		System.out.println("Please enter a password for the username!");
		String passInput = scan.nextLine();
	};
	
	public static void main(String[] args) {
		
		createAccount();
		
	};
	

}
