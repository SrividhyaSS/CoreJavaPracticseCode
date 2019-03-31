package testingpa.java;

public class PrimeNumber {
	
	public static boolean IsPrime (int num)
	{
		
		for (int i=2; i<num; i++)
		{
			if (num % i == 0)
			{
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		
		System.out.println("Veriry 2 is prime number :" +IsPrime(2));
		System.out.println("Veriry 10 is prime number :" +IsPrime(10));
		
	}

}
