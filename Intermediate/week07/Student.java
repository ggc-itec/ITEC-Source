package week07;

public class Student extends Person {

	private String major;
	
	public Student(String n, int b, String major) {
		super(n, b);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + " : " + major;
	}
}
