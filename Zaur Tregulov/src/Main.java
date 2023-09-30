import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("d:\\JavaOCAExam\\test9999.txt");
			FileInputStream fis = new FileInputStream(file);

		} catch (NullPointerException e) {
			System.out.println("Exception 1");
		} catch (Exception e) {
			System.out.println("Exception 2");
		} catch (IOException e) {
			System.out.println("Exception 2");
		} catch (FileNotFoundException e) {
			System.out.println("Exception 2");
		} catch (RuntimeException e) {
			System.out.println("Exception 2");
		} catch (Throwable e) {
			System.out.println("Exception 2");
		}
	}
}
