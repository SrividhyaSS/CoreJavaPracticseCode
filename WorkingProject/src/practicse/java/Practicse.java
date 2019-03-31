package practicse.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practicse {

	public static void main(String[] args) {
		
		String name = "SELENIUM";
		char[] ch = name.toCharArray();
		Map <Character,Integer> storemap = new HashMap <>();
		for (Character chrs : ch)
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
		
		Set<Entry<Character,Integer>> entryset = storemap.entrySet();
		for (Entry<Character,Integer> entry : entryset)
		{
			if (entry.getValue()>1)
			{
				System.out.println("Print duplicate :" +entry.getKey()   +  entry.getValue());
			}
		}
		
	}
}