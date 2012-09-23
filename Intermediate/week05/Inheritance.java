package week05;

import java.util.HashSet;
import java.util.Set;

public class Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new Object();
		Person me = new Employee("df",16,"",3.3);
		me.getParkingSpace();
		
		// Set --> interface
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(1);
		mySet.add(1);
		mySet.add(2);
		System.out.println(mySet);
	}

}
