package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClient {
	
	private Socket s;
	
	public SimpleClient(String ip, int port) {
		try {
			//Socket객체가 생성되면, 서버랑 연결되었다고 볼 수 있음
			s = new Socket(ip,port);
			
			//ip뽑아보기
			InetAddress addr = s.getInetAddress();
			String localIP = "[" + addr.getHostAddress() + "] ";
			
			
			//소켓이 생성되면(서버랑 연결) ClientThread객체 생성
			ClientThread ct = new ClientThread();
			Thread thread = new Thread(ct);
			thread.start();
			
			//data보내기(키보드로 부터)
			//keyboard에서 입력한 데이터 추출
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//닉네임 설정
			System.out.println("[별명을 입력하세요] ");
			String nickName = "[" + br.readLine() + "] ";
			
			OutputStream os = s.getOutputStream();
			//PrintWriter는 Auto flush기능이 있음 2번째 매개변수에 true
			PrintWriter pw = new PrintWriter(os,true);
			
			String data = br.readLine();
			while(data != null) {
				pw.println(nickName + data);
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
	
	class ClientThread implements Runnable{

		@Override
		public void run() {
			try {
				//Server에서 전달된 데이터 추출
				BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
				String receiveData = sbr.readLine(); //서버로부터 데이터 읽음
				while(receiveData != null) {
					System.out.println("echo ==> " + receiveData);
					receiveData = sbr.readLine(); //다음데이터 갱신
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
