package week05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// sets contain unique elements
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		System.out.println(myset);

		// sorted sets keeps the elements in a sorted order
		SortedSet<Integer> mysortedset = new TreeSet<Integer>();
		mysortedset.add(7);
		mysortedset.add(3);
		mysortedset.add(15);
		System.out.println(mysortedset);

		// hash tables stores key, value pairs
		Map<String, String> states = new HashMap<String, String>();
		states.put("GA", "Georgia");
		states.put("NY", "New York");
		states.put("CA", "California");
		states.put("SC", "South Carolina");
		states.put("HI", "Hawaii");
		System.out.println(states.get("GA")); // keys are like call numbers for
												// objects
	}

}
