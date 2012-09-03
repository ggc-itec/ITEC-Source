package week2;

import java.util.Random;

public class Student {

	private String name;
	private int age;
	private final int ssn;
	
	public Student(int ssn) {
		name = "";
		age = 0;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentTag() {
		Random r = new Random();
		return name + " " + age + " " + r.nextInt();
	}
	
	
}
