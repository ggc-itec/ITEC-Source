package week07;

public class Person {

	private String name;
	private int birthYear;

	public Person (String n, int b)
	{
		name = n;
		birthYear = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return name + " : " + birthYear;
	}
	
}
