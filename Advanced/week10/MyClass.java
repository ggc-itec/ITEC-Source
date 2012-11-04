package week10;

import java.util.ArrayList;
import java.util.HashSet;

public class MyClass<T, K> {

	private ArrayList<T> names;
	private HashSet<K> tags;

	public MyClass() {
		names = new ArrayList<T>();
	}

	public ArrayList<T> getNames() {
		return names;
	}

}
