package testingpa.java;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int numbers [] = {4,4,5,5,6,6,7};
		
		
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println(i);
			for (int j=i+1;j<numbers.length;j++)
			{
				System.out.println(j);
				if (numbers[i] == numbers[j]) {
					System.out.println("Print Duplicate Number : " +numbers[j]);
				}
			}
					
		}
			
		}
		
		

	}


