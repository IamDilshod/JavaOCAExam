package p2;

public class A {
	public static void main(String[] args) {
		System.out.println("A");
	}
}

class BankAccount {
	int balance = 0;

	void popolnenieScheta(int money) {
		balance += money;
	}

	void snyatieSoScheta(int money) {
		balance -= money;
	}

	int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount alexAccount = new BankAccount();
		alexAccount.popolnenieScheta(300);
		alexAccount.popolnenieScheta(240);
		System.out.println(alexAccount.getBalance());
		alexAccount.snyatieSoScheta(200);
		System.out.println(alexAccount.getBalance());
	}
}

class Employee {
	int id;
	String surname;
	int age;
	double salary;
	String department;

	public Employee(int i_id, String i_surname, int i_age, double i_salary, String i_department) {
		id = i_id;
		surname = i_surname;
		age = i_age;
		salary = i_salary;
		department = i_department;
	}

	void doubleSalary() {
		salary *= 2;
	}

	int getSalary() {
		return (int) salary;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee alex = new Employee(23, "Alex", 34, 850.01, "IT");
		Employee john = new Employee(38, "John", 42, 2840.01, "Sales");

		System.out.println(alex.getSalary());
		alex.doubleSalary();
		System.out.println(alex.getSalary());

		System.out.println("----------------------");
		System.out.println('-');

		System.out.println(john.getSalary());
		alex.doubleSalary();
		System.out.println(john.getSalary());
	}
}
