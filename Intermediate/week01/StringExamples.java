package week01;

import java.util.ArrayList;

public class StringExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "loremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsum";
		System.out.println( str.substring(0,5) );
		System.out.println( str.substring( str.length()-5 ) );
		
		System.out.println( str.charAt(str.length() -1) );
		System.out.println( str.substring(40,42) );
		System.out.println( str.toUpperCase());

		System.out.println( Math.pow(2,2) );
		System.out.println( Math.abs(-1) );
		System.out.println( Math.max(Math.max( 1,2 ),3) );
		
		String mystr = "" + 'a' + 'b';
		
		System.out.println('a'+3);
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>(100);
		ArrayList<String> myList2 = new ArrayList<String>(1000);
		
		int [] nums = new int[10];
		String [] strs = new String[100];
		
		nums[0] = 7;
		nums[nums.length-1] = 0;
		
		myList.add(1);
		myList2.add("my class");
		
		if (1==1)
		{
		   System.out.println();
		}
		else
		{
			System.out.println();
		}
		
		char grade ='z';
		if( grade == 'a' )
		{
			System.out.println();
		}
		else if(grade == 'b')
		{
			System.out.println();
		}
		else if(grade == 'c')
		{
			System.out.println();
		}
		else
		{
			System.out.println();
		}


	}

}
