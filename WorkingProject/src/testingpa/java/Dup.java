package testingpa.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dup {

	public static void main(String[] args)
	{
		String str = "SELENIUM";
		char [] ch = str.toCharArray();
		HashMap <Character, Integer> storemap = new HashMap <>();
		for (char chrs : ch)
		{
			if (storemap.containsKey(chrs))
			{
				storemap.put(chrs, storemap.get(chrs) + 1);
			}
			else
			{
				storemap.put(chrs, 1);
			}
		}
		
		System.out.println(storemap);
		Set <Entry<Character, Integer >> entryset = storemap.entrySet();
		for (Entry <Character, Integer> entry : entryset)
		{
			if (entry.getValue()>1)
			{
				System.out.println("Print Duplicate Char :" +entry.getKey());
			}
		}
}
}