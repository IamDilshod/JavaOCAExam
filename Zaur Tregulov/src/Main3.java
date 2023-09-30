
public class Main3 {
	public static void foo() {
		foo();
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (StackOverflowError e) {
			System.out.println("Exception catched");
		}
	}
}
