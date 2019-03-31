package testingpa.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesString {

	public static void main(String[] args)
	{
		String names [] = {"JAVA", "SELENIUM", "JAVA", "C","SELENIUM"};
		Map <String,Integer> sortmap = new HashMap <>();
		 /* sortmap.put("JAVA", 1);
		sortmap.put("JAVA", 1);
		sortmap.put("SELENIUM",1);
		sortmap.put("SELENIUM",1);
		sortmap.put("C",1);
		System.out.println(sortmap);*/
		
		for (String name : names)
		{
			//System.out.println(sortmap.get(name));
			//System.out.println(name);
			Integer count = sortmap.get(name);
			if (count == null)
			{
				sortmap.put(name, 1);
				//System.out.println(sortmap.put(name, 1));
				// System.out.println(sortmap);
				
			}
			else
			{
				sortmap.put(name, ++count);
				// System.out.println(sortmap.put(name, ++count));
			}
			
			Set<Entry<String,Integer>> entryset = sortmap.entrySet();
			for (Entry<String,Integer> entry : entryset)
			{
				if(entry.getValue()>1)
				{
					System.out.println("duplicate Element :" + entry.getKey());
				}
			}
			
			
			
	
		}}
}
		
			
		
		
		

	


