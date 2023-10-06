package p5;

public class Employee {
	static final float PI = 3.14F;

	static int getBankVaultValue(int a, int b, int c) {
		return a * b * c;
	}

	static void delit(int a, int b) {
		System.out.println("Natija = " + a / b + " " + a % b);
	}

	public void surface(int radius) {
		System.out.println(PI * radius * radius);
	}

	static void length(int radius) {
		System.out.println(2 * PI * radius);
	}

	void info(int radius) {
		System.out.println("Radius = " + radius);
		System.out.println("Surface = " + 2 * PI * radius);
		System.out.println("Length = " + PI * radius * radius);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		length(5);
		employee.surface(6);
		employee.info(7);

	}
}

class Office {
	public static void main(String[] args) {

	}
}
