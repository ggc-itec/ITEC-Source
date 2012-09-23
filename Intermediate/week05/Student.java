package week05;

public class Student extends Person {

	public Student(String name, int age, String gender, double height) {
		super(name, age, gender, height);
	}

	@Override
	public String getParkingSpace() {
		return "somewhere far far away";
	}

	/*
	 * @Override public String toString() { return "Student Name: " + getName()
	 * + " Student age: " + getAge(); }
	 */

	public double payTuition() {
		if (getAge() > 30)
			return 0;
		else
			return 40000;
	}

	// coupon 0 - 1
	public double payTution(double coupon) {
		return payTuition() - payTuition() * coupon;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student myStu = (Student) obj;

			String n = myStu.getName();
			int a = myStu.getAge();

			if (n.equals(getName()) && a == getAge())
				return true;
			else
				return false;

		}
		return false;
	}

}
