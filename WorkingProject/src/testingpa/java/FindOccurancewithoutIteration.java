package testingpa.java;

import java.util.Scanner;

public class FindOccurancewithoutIteration {

	public static int countOfChar(String inputString, char charToFind) {
		// Converting string into same case
		 System.out.println(inputString = inputString.toUpperCase());

		// Converting char to upper case
		
		String charString = Character.toString(charToFind).toUpperCase();

		// Find length of actual string
		int lengthBeforeReplacingSpace = inputString.length();

		// Replace char to be searched for by empty character
		System.out.println(inputString = inputString.replace(charString, ""));

		// FInd the new length after replacement
		int lengthAfterReplacingSpace = inputString.length();

		// FInd the difference
		int countOfSpace = lengthBeforeReplacingSpace - lengthAfterReplacingSpace;

		// return the difference which is actually occurrence of char
		return countOfSpace;

	}

	public static void main(String[] args) {

		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string :");

		String userInput = sc.nextLine();

		System.out.println("Please enter the char to find occurrence in : " + userInput);

		char charToFind = sc.nextLine().charAt(0);

		sc.close();

		System.out.println("You entered: " + userInput);
		System.out.println("Char to be found: " + charToFind);

		System.out.println("Count of " + charToFind + " is :" + countOfChar(userInput, charToFind));

	}
}
