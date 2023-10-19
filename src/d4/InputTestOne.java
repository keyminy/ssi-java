package d4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTestOne {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("ready....");
		
		try {
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
