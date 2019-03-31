package testingpa.java;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "SELENIUM";
		String rev = "";
		int length = str.length();
		System.out.println(length);
		for (int i=length-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
	
		String str1 = "SELENIUM";
		StringBuffer sf = new StringBuffer(str1);
		System.out.println(sf.reverse());
		
}
}
