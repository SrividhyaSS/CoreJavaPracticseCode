package testingpa.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementinArray {

	public static void main(String[] args) {
		
		int [] array = new int [5];
		int location = 0;
		int max = 4;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the five integer element form the users :");
		for (int i=0; i<=max; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the position of element to be removed : ");
		location = sc.nextInt();
		
		for (int i=location; i<max; i++)
		{
			array[i] = array[i+1];
			//System.out.println(array[i] = array[i+1]);
		
		
		}
		
		System.out.println("Print the element after removing :");
		for (int i=0; i<max; i++)
		{
			
			System.out.println(array[i]);
		}
		
	}
		

}
