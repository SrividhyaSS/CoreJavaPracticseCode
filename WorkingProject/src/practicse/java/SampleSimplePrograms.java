package practicse.java;

import java.util.Scanner;

public class SampleSimplePrograms {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Four digit Number");
		int number1 = scan.nextInt();
		System.out.println("Enter Four digit Number");
		int number2 = scan.nextInt();
		System.out.println("Enter Four digit Number");
		int number3 = scan.nextInt();
		System.out.println("Enter Four digit Number");
		int number4 = scan.nextInt();
		if (number1 == number2 && number2 == number3 &&  number3 == number4)
		{
			System.out.println("Numbers are Equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
	}

	}


