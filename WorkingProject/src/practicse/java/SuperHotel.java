package practicse.java;

import java.util.HashMap;

public class SuperHotel extends Hotel{
	public void book() {
		bookings--;
		}
	
	public void book(int size) {
		book();
		super.book();
		bookings += size;
		}
	public static void main(String args[]) {
		SuperHotel Shotel = new SuperHotel();
		Shotel.book();
		System.out.print(Shotel.bookings);
		
		}

}
