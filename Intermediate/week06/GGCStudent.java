package week06;

public class GGCStudent implements IStudent, Comparable<GGCStudent> {

	private String name;
	private int age;

	public GGCStudent() {

	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		System.out.println("Working hard...");
	}

	@Override
	public void goSleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void studyHard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void osmossis() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(GGCStudent stud) {
		return 0;
	}

}
