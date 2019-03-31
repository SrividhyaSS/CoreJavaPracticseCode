package testingpa.java;

public class PalindromeNumbers {
	
	
	public static void ispalindromeNumbers(int num)
	{
		int r=0;
		int sum=0;
		int t;
		t=num;
		
		while (num>0)
		{
			r = num % 10;
			sum = (sum * 10 ) + r;
			num = num / 10;
		}
		
		if (t == sum)
		{
			System.out.println("Number is Palindorme");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}

	public static void main(String[] args) {
		ispalindromeNumbers(221);
		
	}

}



