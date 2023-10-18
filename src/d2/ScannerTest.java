package d2;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.println("준비 완료....");
		while(true) {
			int data = sc.nextInt();
			System.out.println(data);
			
			if(data == -1) {
				break;
			}
		}
	}

}
