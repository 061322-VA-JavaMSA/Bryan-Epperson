import java.util.Scanner;

public class Adventure {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void startMenu() {
		System.out.println("Choose the start of your adventure!");
		System.out.println("1: Go take a hike in the forest!");
		System.out.println("2: Go to the local tavern!");
		System.out.println("3: Go to the Mountains!");
		System.out.println("4: Go visit your grandmother!");
		String userInput = scan.nextLine();
		switch(userInput) {
		case "1":
			theForest();
		default:
			System.out.println("Thats not a valid option!");
			System.out.println("----------------------------------");
			startMenu();
			break;
		}

		
	}
	public static void theForest() {
		System.out.println("Welcome to the forest!");
	}
	public static void main(String[] args) {
		startMenu();
	};

}
