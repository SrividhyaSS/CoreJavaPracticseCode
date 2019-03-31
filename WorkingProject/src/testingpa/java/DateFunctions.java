package testingpa.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {

	public static void main(String[] args)
	{
		
		String startDate = "01/01/2019";
		System.out.println(startDate);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String currentdate = dateFormat.format(date);
		System.out.println(currentdate);
		
	

	}

}
