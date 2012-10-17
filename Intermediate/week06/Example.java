package week06;

public class Example {

	public static void main(String[] args) {

		IStudent[] studs = new IStudent[10];

		IStudent grizzly = new GGCStudent();
		IStudent grizzly2 = new GSUStudent();

		studs[0] = new GGCStudent();
		studs[1] = new GGCStudent();
		studs[2] = new GSUStudent();

		MyImplementation my = new MyImplementation();
		my.implementThis();

		String str1 = "aardvark";
		String str2 = "zebra";

		System.out.println(str2.compareTo(str1));
	}
}
