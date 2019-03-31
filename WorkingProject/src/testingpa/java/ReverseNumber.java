package testingpa.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {

	public static void main(String[] args) {

		List<Integer> addlist = new ArrayList<>();
		addlist.add(100);
		addlist.add(101);
		addlist.add(102);
		addlist.add(103);
		addlist.add(104);

		System.out.println("Print the Numbers before Reverse:" + addlist);
		Collections.reverse(addlist);
		System.out.println("Print the Numbers after Revers :" + addlist);
		int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

	}

}
