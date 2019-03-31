
package testingpa.java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str = "SELENIUM";
		char[] ch = str.toCharArray();
		
		for (Character chr : ch)
		{
			System.out.println(chr);
		}
		
		// Wrapper class - Data Conversion //
		int i = 100;
		String result = String.valueOf(i);
		
		System.out.println("int to String Conversion :" +result);
		String value = result + "test";
		System.out.println(value);
		
		

	}

}
