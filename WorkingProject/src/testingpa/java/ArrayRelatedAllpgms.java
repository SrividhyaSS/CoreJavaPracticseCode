package testingpa.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRelatedAllpgms {

	public static void main(String[] args) {
		// Arrays Functions //

		// 1. Sorting the Array //

		int[] numbers = { 10, 50, 30, 40, 20 };
		Arrays.sort(numbers);
		System.out.println("Sorted Array :" + Arrays.toString(numbers)); // Write an array in to output console //

		// 2. Searching element in side the array //
		int searchelement = Arrays.binarySearch(numbers, 30); // array name and value to search //
		System.out.println("Found 30 @ " + searchelement);

		// 3. Reverse Array
		List<Integer> addlist = new ArrayList<>();
		addlist.add(100);
		addlist.add(101);
		addlist.add(102);
		addlist.add(103);
		addlist.add(104);

		System.out.println("Print the Numbers before Reverse:" + addlist);
		Collections.reverse(addlist);
		System.out.println("Print the Numbers after Revers :" + addlist);

		// 4. Finding minimum and maximum //
		Integer[] numbers1 = { 10, 20, 30, 40, 50 };
		int min = (int) Collections.min(Arrays.asList(numbers1));
		int max = (int) Collections.max(Arrays.asList(numbers1));
		System.out.println("Print the minimum :" + min);
		System.out.println("Print the maximum : " + max);

		// 5. Merging Two Arrays
		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();		
		System.out.println("Mergerd Array OutPut : " + Arrays.toString(c));

		// 6. Check Two arrays are equals, equals () return boolean value OR Compare Two
		// Arrays //
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		System.out.println("Compare Two Arrays : " + Arrays.equals(arr1, arr2));
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}

		// 7. How to determine the upper bound of a two dimensional array ?
		String[][] data = new String[2][5];
		System.out.println("Dimension 1: " + data.length);
		System.out.println("Dimension 2: " + data[0].length);

		// 8. Finding Common Element in Arrays
		int[] commonele1 = { 1, 4, 5, 7 };
		int[] commonele2 = { 2, 3, 5, 6 };
		for (int i = 0; i < commonele1.length; i++) {
			for (int j = 0; j < commonele2.length; j++) {
				if (commonele1[i] == commonele2[j]) {
					System.out.println("Print the Common Element:  " + commonele1[i]);
				}
			}
		}

		// 9. Removing an element from Array //
		ArrayList<Object> objarray = new ArrayList<>();
		objarray.clear();
		objarray.add(0, "0th Element");
		objarray.add(1, "1st Element");
		objarray.add(2, "2nd Element");
		objarray.add(3, "3rd Element");
		System.out.println("Print array before Removing :" + objarray);
		objarray.remove(0);
		System.out.println("Print array after Removing :" + objarray);
	}

}
