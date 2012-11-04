package week09;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQExample {

	public static class MyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			if (o1.compareTo(o2) > 0) {
				return -1;
			} else if (o1.compareTo(o2) < 0) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	public class MyComparable implements Comparable<String> {

		@Override
		public int compareTo(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>(100,
				new MyComparator());
		pq.add("zebra");
		pq.add("andrew");
		pq.add("bob");
		pq.add("claire");
		pq.add("babs");

		System.out.println(pq.remove());
		System.out.println(pq.remove());

	}

}
