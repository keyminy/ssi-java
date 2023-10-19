package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
	
	private Socket s;
	
	public SimpleClient(String ip, int port) {
		try {
			//Socket객체가 생성되면, 서버랑 연결되었다고 볼 수 있음
			s = new Socket(ip,port);
			//data보내기(키보드로 부터)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			OutputStream os = s.getOutputStream();
			//PrintWriter는 Auto flush기능이 있음 2번째 매개변수에 true
			PrintWriter pw = new PrintWriter(os,true);
			
			String data = br.readLine();
			while(data != null) {
				pw.println(data);
				data = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("클라이언트");
		new SimpleClient("localhost",9999);
	}

}
