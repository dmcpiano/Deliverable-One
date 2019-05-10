package dev1corrections;

import java.util.Scanner;

public class What_to_eat_corrections {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String eventType;
		int partySize;
		String mealSuggestion;
		String prepSuggestion;
		String result;

		mealSuggestion = "sandwiches";
		prepSuggestion = "in the microwave";

		System.out.println("What style of event is this? Choose from: casual, semi-formal or formal.");
		eventType = scnr.nextLine();

		System.out.println("How many people are attending?");
		partySize = scnr.nextInt();

		if (eventType.equals("casual")) {
			mealSuggestion = "sandwiches";
		}

		else if (eventType.equals("semi-formal")) {
			mealSuggestion = "fried chicken";
		}

		else if (eventType.equals("formal")) {
			mealSuggestion = "chicken parmesan";
		}

		if (partySize == 1) {
			prepSuggestion = "in the microwave";
		}

		else if ((partySize >= 1 && partySize <= 12)) {
			prepSuggestion = "in your kitchen";
		}

		else if (partySize >= 13) {
			prepSuggestion = "by a caterer";
		}

		result = ("Since you're hosting a " + eventType + " event for " + partySize + " partcipants, you should serve "
				+ mealSuggestion + " prepared " + prepSuggestion + ".");

		System.out.println(result);

	}
}
