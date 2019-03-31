package practicse.java;

import java.util.Set;

public class ArrayPracticse {

	public static void main(String[] args) {
		
		int arr1 [] = {1,2,3,3,4};
		int count=0;
		
		for (int i=0; i<arr1.length; i++)
		{	
		//	System.out.println(arr1[i]);
		for (int j=i+1; j<arr1.length; j++)	
		{
			System.out.println(arr1[j]);
			if (arr1[i] == arr1[j])
			{
				System.out.println("Print duplicate Array :" +arr1[j]);
				count ++; 
				System.out.println("Number of occurance :" +count);
			
			}
			
			
		
		
	
		}
	}
	}
}




