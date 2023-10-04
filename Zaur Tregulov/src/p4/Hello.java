package p4;

public class Hello {

}

class Student {
	int id;
	int age;
	int course;
	String name;
	String surname;

	public Student(int id2, int age2, int course2, String name2, String surname2) {
		id = id2;
		age = age2;
		course = course2;
		name = name2;
		surname = surname2;
	}

	public Student(int id2, String name2, String surname2, int course2) {
		id = id2;
		course = course2;
		name = name2;
		surname = surname2;
	}

	public Student() {
	}

	public static void main(String[] args) {
		Student alexStudent = new Student();
		Student johnStudent = new Student(34, "John", "Ashley", 3);
		Student fernandStudent = new Student(22, 27, 1, "Fernand", "George");
	}
}
