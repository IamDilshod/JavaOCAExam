package p5;

public class Employee {
	static String name;
	static int bankVault;
	static boolean bool;
	static double d;

	static int getBankVaultValue() {
		return bankVault;
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}

class Office {
	public static void main(String[] args) {
		System.out.println(Employee.bankVault); // 0
		System.out.println(Employee.name); // null
		System.out.println(Employee.getBankVaultValue()); // 0
		System.out.println(Employee.bool); // false
		System.out.println(Employee.d); // 0.0
	}
}
