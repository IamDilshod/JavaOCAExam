import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	public static int foo() throws FileNotFoundException {
		int a = 10;
		try {
			File file = new File("d:\\JavaOCAExam\\test999.txt");
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("Exception 1");
			throw e;
		} finally {
			System.out.println("Finally block");
		}

		return 9;
	}

	public static void main(String[] args) {
		try {
			System.out.println(foo());
		} catch (FileNotFoundException e) {

		}
	}
}
