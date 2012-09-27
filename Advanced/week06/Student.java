package week06;


public class Student implements Comparable<Student> {

	private String name;
	private int age;

	private enum Gender {
		MALE, FEMALE
	}

	private Gender gender;

	public Student(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	@Override
	public int hashCode() {
		int h1 = name.hashCode();
		int h2 = Integer.valueOf(age).hashCode();
		final int HASH_MULTIPLIER = 29;
		int h = HASH_MULTIPLIER * h1 + h2;
		return h;

	}

	@Override
	public int compareTo(Student o) {
		if( o.getAge() == getAge() )
			return 0;
		else if( o.getAge() > getAge() )
		{
			return -1;
		}
		else {
			return 1;
		}
	}

}
