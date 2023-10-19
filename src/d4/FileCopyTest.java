package d4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileCopyTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("copy.txt");
			PrintWriter pw = new PrintWriter(fw);
			String data = br.readLine();
			while(data != null) {
				pw.println(data);
				data = br.readLine();
			}
			pw.close();
			System.out.println("복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
