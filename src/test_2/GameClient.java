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
	private BufferedReader keyboard;// 키보드 연결을 위해
	PrintWriter pw;

	public GameClient(String ip, int port) {
		try {

			socket = new Socket(ip, port);
			System.out.println("서버 연결 성공");
			// 입력 버퍼 : 닉네임 설정(키보드 입력)
			keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 쓰기버퍼 : 클라 -> 서버
			OutputStream os = socket.getOutputStream();
			// PrintWriter는 Auto flush기능이 있음 2번째 매개변수에 true
			pw = new PrintWriter(os, true);

			System.out.println("사용할 별칭을 입력하세요 : ");
			String nickName = keyboard.readLine();
			pw.println(nickName);
			
			// 문제 보여주는것은 ClientThread
			ClientThread ct = new ClientThread(socket);
			Thread thread = new Thread(ct);
			thread.start();

			while (true) {
				/* (main스레드) : 키보드 입력과, 쓰는부분을 while문으로.. */
				System.out.println("정답을 입력하세요 : ");
				String answer = keyboard.readLine();
				// 정답 입력한 것을 서버로 write
				pw.println(answer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new GameClient("localhost", 9999);
	}

}
