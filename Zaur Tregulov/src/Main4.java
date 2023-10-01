public class Main4 {
	public void foo() {
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			String str = null;
			try {
				System.out.println(str.length());
			} catch (NullPointerException e2) {
				System.out.println("Catched by nested catch block");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException catched");
		}
	}

	public static void main(String[] args) {
		Main4 main4 = new Main4();
		main4.foo();
	}
}
