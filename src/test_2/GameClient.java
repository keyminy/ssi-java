package test_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class GameClient {
	private Socket socket;
	private BufferedWriter bw;
	private BufferedReader br;//키보드 연결을 위해
	
	
	public GameClient(String ip, int port) {
		try {
			try {
				socket = new Socket(ip,port);
				System.out.println("서버 연결 성공");
				//입력 버퍼 : 닉네임 설정(키보드 입력)
				br = new BufferedReader(new InputStreamReader(System.in));

				//쓰기버퍼 : 클라 -> 서버
				OutputStream os = socket.getOutputStream();
				//PrintWriter는 Auto flush기능이 있음 2번째 매개변수에 true
				PrintWriter pw = new PrintWriter(os,true);
				/* 키보드 입력과, 쓰는부분을 while문으로..*/
				while(true) {
					System.out.println("사용할 별칭을 입력하세요 : ");
					String nickName = br.readLine();
					pw.println(nickName);					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//			소켓이 생성되면(서버랑 연결) ClientThread객체 생성
			ClientThread ct = new ClientThread(socket);
			Thread thread = new Thread(ct);
			thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		new GameClient("localhost",9999);
	}

}
