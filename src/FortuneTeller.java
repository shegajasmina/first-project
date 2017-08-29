
import java.util.Scanner;

public class FortuneTeller {

	private static final String Help = null;

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String favColor;
		int numberOfSiblings;
		String job = "";
		String child = "";
		String destination;
		String marriage = "";

		System.out.println("Enter Your First Name: ");
		firstName = scanner1.nextLine();

		System.out.println("Enter Your Last Name: ");
		lastName = scanner1.nextLine();

		System.out.println("Enter Your Age: ");
		age = scanner1.nextInt();

		if (age % 2 == 0) {
			marriage = "in 5 years";
		} else {
			marriage = "in 10 years";
		}

		System.out.println("Enter Your Birth Month: ");
		birthMonth = scanner1.nextInt();

		if (birthMonth >= 1 && birthMonth <= 4) {
			job = "A Housekeeper";
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			job = "A Technician";
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			job = "A Programer";
		} else if (birthMonth > 12) {
			job = "A begger";
		}

		System.out.println("Enter Your Favorite ROYGBIV Color: ");
		System.out.println("Enter (Help) If You Do Not Know What ROYGBIV Is: ");
		favColor = scanner1.next();

		if (favColor.equalsIgnoreCase("Help")) {
			System.out.println("ROYGBIV Stands For: Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
			System.out.println("Enter Your Favorite ROYGBIV Color: ");
			favColor = scanner1.next();
		}
		if (favColor.equalsIgnoreCase("Red")) {
			child = "1 child";
		}

		if (favColor.equalsIgnoreCase("Orange")) {
			child = "2 children";
		}

		if (favColor.equalsIgnoreCase("Yellow")) {
			child = "3 children";
		}

		if (favColor.equalsIgnoreCase("Green")) {
			child = "2 dogs";
		}

		if (favColor.equalsIgnoreCase("Blue")) {
			child = "triplets!";
		}

		if (favColor.equalsIgnoreCase("Indigo")) {
			child = "twins!";
		}

		if (favColor.equalsIgnoreCase("Violet")) {
			child = "cats, lots of cats";
		}

		System.out.println("Enter Your Number of Siblings: ");
		numberOfSiblings = scanner1.nextInt();

		if (numberOfSiblings == 0) {
			destination = "Spain";
		} else if (numberOfSiblings == 1) {
			destination = "Australia";
		} else if (numberOfSiblings == 2) {
			destination = "Japan";
		} else if (numberOfSiblings == 3) {
			destination = "Albania";
		} else if (numberOfSiblings > 3) {
			destination = "Italy";
		} else {
			destination = "Arkansas";
		}

		System.out.println(firstName + " " + lastName + " will get married " + marriage + " and will work as " + job
				+ ", will have " + child + ", and will live in " + destination + ".");

	}
}
