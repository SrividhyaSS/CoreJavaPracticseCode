package testingpa.java;

import java.util.HashMap;
import java.util.Map;

public class CountofEachCharacter {

	public static void main(String[] args) {
		String str = "SELENIUM";
		char ch [] = str.toCharArray();
		Map<Character,Integer> storemap = new HashMap <>();
		for (Character chrs : ch)
		{
			if  (storemap.containsKey(chrs))
			{
				System.out.println(storemap.put(chrs, storemap.get(chrs) + 1));
			}
			else
			{
				System.out.println(storemap.put(chrs, 1));
			}
		}
		
		System.out.println(storemap);
		
		

	}

}
