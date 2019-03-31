package testingpa.java;

import java.util.Arrays;

public class SmallandLargestArray {

	public static void main(String[] args) {
		
		int numbers [] = {-10, 24, 50, -88, 24,24};
		int largest = numbers[0];
		int smallest = numbers[0];
				
		for (int i=0; i<numbers.length; i++)
		{
			if (numbers[i]>largest)
				{
				largest = numbers[i];
				}
			else if (numbers[i] < smallest)
			{
				smallest = numbers [i];
			}
		}	
		
		
		 System.out.println("\n Given Array :" + Arrays.toString(numbers)); 
		
		
		System.out.println("\n Largest Number : " +largest);
		
		System.out.println("\n Smallest Number :" +smallest);
		
		
		
		
		}

	}


