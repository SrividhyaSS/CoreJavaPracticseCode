package testingpa.java;

public class StringFunctions {

	public static void main(String[] args) 
	{
		
		String str = "SELENIUM";
		System.out.println(str.length()); // This is finding length of String //
		
		System.out.println(str.charAt(1)); // using index print the character //
		
		System.out.println(str.indexOf("E")); // using character print the index //
		System.out.println(str.indexOf("E",str.indexOf("E")+1)); // occurance to get the index of E
		System.out.println(str.indexOf("E",str.indexOf("E")+7));
		System.out.println(str.indexOf(str)); // String position
		System.out.println(str.indexOf("A")); // No such string, so it throws -1
		
		System.out.println(str.substring(1, 4)); // printing character which is start from index 1 to index 4 //
		
		
		String s = " Hello World ";
		System.out.println(s.trim());// trimming first and last places //
		
		// Remove in between the spaces also //
		
		System.out.println(s.replace(" ", "")); 		
		String date = "01-01-2019";
		System.out.println(date.replace("-", "/"));
		
		// Split Functions 
		
		String s2 = "Hello_Word_Test_Selenium";
		String testval [] = s2.split("_");
		for (int i=0; i<testval.length; i++)
		System.out.println(testval[i]);
		System.out.println(s2.split("_"));
		
		// String Concatenation - adding string 
		String s1 = "Hello";
		String s3 = "World";
		String a = "100";
		String b = "200";
		System.out.println(s1+s3+a+b);
		
		// Remove junks using String Regex expression
		String store = "@#$%^&& SELENIUM $#@$@#$";
		System.out.println(store.replaceAll("[^a-z,A-Z,0-9]", ""));
		System.out.println(store.replaceAll("[a-z,A-Z,0-9]", ""));
		
		// Convert String to Integer Wrapper class - data conversion //
		String strNumber = "100";
		int result = Integer.parseInt(strNumber);
		System.out.println(result);
		
		// check to string functions in student.java class //
		
		
		
		
		
		
		
		
	}

}
