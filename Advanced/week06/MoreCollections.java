package week06;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MoreCollections {

	public static void main(String[] args) {
		SortedMap<String,String> sm = new TreeMap<String,String>();
		sm.put("MA", "Massachusetts");
		if( sm.put("MA", "Masshole") != null )
			System.out.println("Ouch");
		sm.put("RI", "Rhode Island");
		sm.put("NY", "New York");
		sm.put("OR", "Oregon");
		sm.put("AL", "Zebra");
		sm.put("FB", "facebook");
		sm.put("Ea", "electric arts");
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		
		
		for(Entry<String,String> entry: sm.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		Comparator<String> comp = new  Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}
}
