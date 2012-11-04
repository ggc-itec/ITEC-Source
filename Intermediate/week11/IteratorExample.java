package week11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();

		nums.add(2);
		nums.add(2);
		nums.add(2);
		nums.add(8);
		nums.add(2);
		nums.add(2);
		nums.add(2);

		// don't do this!
		/*
		 * for(int i=0; i<nums.size(); i++) { //System.out.print(nums.get(i) +
		 * " "); if( nums.get(i) == 2) { nums.remove(i); } }
		 */

		// do what? why, use iterators!
		Iterator<Integer> iterator = nums.iterator();

		while (iterator.hasNext()) {
			int temp = iterator.next();
			if (temp == 2) {
				iterator.remove();
			}
		}

		System.out.println();

		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}

	}
}
