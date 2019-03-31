package practicse.java;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 7, 10 };
		int[] b = { 0, 1, 0, 6, 3 };
		int resultA = 0;
		int resultB = 0;

		for (int i = 0; i < a.length; i++)

		{
			for (int j = 0; j < b.length; j++) {

				if (a[i] > b[j]) {
					resultA = resultA + 1;

				} else if (b[j] > a[i]) {
					resultB = resultB + 1;

				}
				i++;
			}
		}
		int[] c = { resultA, resultB };
		System.out.println(Arrays.toString(c));
	}
}
