import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		File file = new File("d:\\JavaOCAExam\\test9999.txt");

		catch (FileNotFoundException e) {
			System.out.println("Exception catched!!!");
		} 
		try {
			FileInputStream fis = new FileInputStream(file);
			System.out.println("Hello 1");
		}
		finally {
			System.out.println("Finally block");
		}

		System.out.println("Hello 2");
	}
}
