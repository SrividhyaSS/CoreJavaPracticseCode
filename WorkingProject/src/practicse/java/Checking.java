package practicse.java;

public class Checking {

	public static void main(String[] args)
	{
		int [] a = {2,1};
		int [] b = {5,1};
		int count=0;
		int resultA = a[0];
		int resultB = b[0];
		
		
			
		for (int i=0; i<a.length; i++)
		{			
			//System.out.println(a[i]);
			for (int j=0; j<b.length;j++)
			{			
				//System.out.println(b[j]);
				if (a[i] > b[j])
				{
					resultA = 1;
					resultB = 0;
					
					System.out.println(resultA);
					System.out.println(resultB);
				}
				else
				{
					resultA = 0;
					resultB = 1;
					System.out.println(resultA);
					System.out.println(resultB);
				}
					
				}
			
			
			
			
			}	
	}		
		
		
	}
	


				
			
		
						
			
		
				
		
		
		
			
		
		
	


