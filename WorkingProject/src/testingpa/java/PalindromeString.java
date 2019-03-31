package testingpa.java;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str1 = "MADAM";
		String str2 = "";
		int length = str1.length();
		for (int i=length-1; i>=0; i--)
		{
			str2 = str2 + str1.charAt(i);
		}
			System.out.println(str2);
			
			if (str2.equalsIgnoreCase(str1))
			{
				System.out.println("Given String is Palindrome");
			}
			else
			{
				System.out.println("Given String is not Palindrome");
			}
	}

}
