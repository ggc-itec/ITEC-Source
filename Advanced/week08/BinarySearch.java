package week08;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] nums2 = { 12, 234, 45, 34, 35, 435345, 34, 534, 53, 4345, 0 };

		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums2, 0));

	}
}
