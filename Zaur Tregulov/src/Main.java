import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		File file = new File("d:\\JavaOCAExam\\test.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.read();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(100);

		fis.close();
		fos.close();
	}
}
