public class Main2 {

	public static void foo() {
		String str = null;
		System.out.println(str.length());
	}

	public static void bar() throws NullPointerException {
		foo();
	}

	public static void main(String[] args) {
		try {
			bar();
		} catch (NullPointerException e) {
			System.out.println("Exception catched");
		}
	}
}
