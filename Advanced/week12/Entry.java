package week12;

public class Entry implements Comparable<Entry> {

	int distance;
	char letter;

	@Override
	public int compareTo(Entry arg0) {
		return (distance - arg0.distance);
	}

	@Override
	public boolean equals(Object obj) {
		Entry e = (Entry) obj;
		return e.distance == distance && e.letter == letter;
	}

}
