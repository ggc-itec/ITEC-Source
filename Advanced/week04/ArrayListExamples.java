package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		// turning a list into an array
		String[] strs = { "foo", "bar" };
		// how to print an array in one statement
		System.out.println(Arrays.toString(strs));
		List<String> s = Arrays.asList(strs);
		System.out.println(s);

		// preferred method of removing elements from a list
		for (Iterator<Integer> it = nums.iterator(); it.hasNext();) {
			// you can't call the remove() method before calling the next()
			// method
			int temp = it.next();
			if (temp % 2 == 0)
				it.remove();
		}
		System.out.println(nums);

		// preferred idiom to iterate over a list
		for (int num : nums) {
			System.out.println(num);
		}

		// basic set
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(1);
		// set only adds unique elements
		System.out.println(set);
	}

}
