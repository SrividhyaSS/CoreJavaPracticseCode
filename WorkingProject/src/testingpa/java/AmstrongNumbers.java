package testingpa.java;

public class AmstrongNumbers {
	// 153
	// 1*1*1 = 1
	// 5 * 5 * 5 = 125
	// 3 * 3 * 3 = 27
	// sum : 1+125+27 = 153
	
	public static void isAmStrongNumbers (int num)
	{
		int cube =0;
		int r;
		int t;
		t = num;
		
		while (num > 0)
		{
			r = num % 10;
			num = num / 10;
			cube = (cube + (r * r *r));
		}
			
			if (t == cube)
			{
				System.out.println("Print AmStrong");
				
			}
			else
			{
				System.out.println("Print Not a AmStrong");
			}
			
		}
		
	

	public static void main(String[] args) {
		isAmStrongNumbers(153);

	}

}
