package p4;

public class Hello {
	int a;
	String str;
}

class Q {
	int id;
	int age;
	String name;
	double salary;

	Q(int id) {
		this(id, 0, null, 0);
	}

	Q(int id, int age) {
		this(id, age, null, 0);
	}

	Q(int id, int age, String name) {
		this(id, age, name, 0);
	}

	Q(int id, int age, String name, double salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {

	}
}
