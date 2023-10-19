package d4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("save.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String data = "abcdefg";
		bw.write(data);
		bw.close();
		System.out.println("종료");
	}

}
