package d4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImgCopyTest {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("logo.png");
			
			FileOutputStream fo = new FileOutputStream("logoCopy.png");
			
			int bytes = 0;
			int data = fi.read();
			
			while(data != -1) {
				bytes++;
				fo.write(data);
				data = fi.read();
			}
			fo.close();
			System.out.println(bytes + "바이트 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
