package d4;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String data = br.readLine();
			while(data != null) {
				System.out.println(data);
				data = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
