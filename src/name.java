import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class name {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("name.rtf");
			try {
				int letter;
				while ((letter = (char) fr.read()) != -1) {
					System.out.print((char) letter);
				}
				System.out.println((char) fr.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
