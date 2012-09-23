package week05;

public abstract class Person {

	private int age;
	private String name;
	private String gender;
	private double height;
	
	public Person() {
		this.age = 0;
		this.name = "foobar";
		this.gender = "none";
		this.height = 0;
	}
	
	public Person(String n, int a, String g, double h)
	{
		name = n;
		age = a;
		gender = g;
		height = h;
	}

	public  int getAge() {
		return age;
	}

	public  void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract String getParkingSpace();
	

}
