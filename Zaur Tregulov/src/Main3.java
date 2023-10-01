
public class Main3 {
	public static void foo() {
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Exception catched.");
			throw e;

		} finally {
			System.out.println("Finally block.");
		}
	}

	public static void main(String[] args) {
		foo();
	}
}