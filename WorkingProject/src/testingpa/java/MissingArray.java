package testingpa.java;

public class MissingArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,4,5,6,7,8};
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
		int sum1=0;
		for (int j=1; j<=8; j++)
			
		{
			
			sum1 = sum1 + j;
			
			
		}
		System.out.println(sum1);
		
		System.out.println("Print the Missing Number ::: "  +(sum1-sum));
		
	}

}
