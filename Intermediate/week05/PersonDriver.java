package week05;

import java.util.Arrays;

public class PersonDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*Employee drim = new Employee("drim",90,"male",7.5);
		System.out.println(drim);
		
		int [] nums = {1,2,3};
		System.out.println(Arrays.toString(nums));*/
		Student a = new Student("foo",18,"m",5);
		
		Student b = new Student("foo",19,"f",9);
		
		System.out.println( a.equals(b) );
		
	}

}
