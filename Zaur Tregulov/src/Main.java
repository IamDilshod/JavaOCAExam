import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	public void foo() throws FileNotFoundException {
		File file = new File("d:\\JavaOCAExam\\test9999.txt");
		FileInputStream fis = new FileInputStream(file);
	}

	public void bar() throws Throwable {
		foo();
	}

	public static void main(String[] args) {

	}
}
