package practicse.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingEmployeeDetails {

	public static void main(String[] args) 
	{
		ArrayList<EmployeeInformation> emp = new ArrayList<>();
		emp.add(new EmployeeInformation(101,"RAM"));
		emp.add(new EmployeeInformation(103,"SAI"));
		emp.add(new EmployeeInformation(102,"BABA"));
		
		Comparator<EmployeeInformation> comemp = Comparator.comparing(EmployeeInformation::getAssociateID);
		Collections.sort(emp, comemp);
		System.out.println("Sort by ID");
		for (EmployeeInformation emps : emp)
		{
			System.out.println(emps.AssociateID);
		}

	}

}
