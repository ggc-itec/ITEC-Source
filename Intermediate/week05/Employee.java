package week05;

public class Employee extends Person {

	// create a Student class
	// need a constructor
	// override toString()
	// override getParkingSpace()
	// create a method payTuition()

	// double payTuition()
	// if age > 30 --> 0
	// if age < 30 --> 40000

	// double payTuition(double coupon)
	// coupon is a percent value;

	// equals()

	
	public Employee(String name, int age, String gender, double height) {
		super(name, age, gender, height);
	}

	@Override
	public String getParkingSpace() {
		return "somewhere close";
	}

	@Override
	public String toString() {
		return "Name: " + super.getName() + " Age: " + super.getAge();
	}

}
