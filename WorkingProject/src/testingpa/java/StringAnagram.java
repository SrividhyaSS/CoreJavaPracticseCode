package testingpa.java;

import java.util.Arrays;

public class StringAnagram {
	
	 static boolean iSanagram (String s1, String s2)
	{
		char [] chararray1 = s1.toCharArray();
		char [] chararray2 = s2.toCharArray();
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		return false;
		
	}

	public static void main(String[] args) {
		String s1 = "MOTHERINLAW";
		String s2 =  "HITLERWOMEN";
		
		
		

	}

}
