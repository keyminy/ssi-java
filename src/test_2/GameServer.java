package test_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class GameServer {
	
	private ServerSocket serverSocket; // 클라이언트 연결을 받는 서버 소켓
	private Socket socket; // 서버 소켓으로부터 생성된, 실제 통신을 하는 소켓
	private List<Socket> socketList = new ArrayList<>();
	private BufferedReader br;
	
	
	public GameServer() {
		this(9999); // 9999포트로 시작
	}

	public GameServer(int port) {
		try {
			// ServerSocket 생성
			System.out.println("Start Server...");
			serverSocket = new ServerSocket(port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		serverReady();
	}




	private void serverReady() {
		try {
			// client가 들어오는지 확인, 들어오면 socket생성
			socket = serverSocket.accept();
			socketList.add(socket);
			
			//입력 버퍼 생성(클라이언트 입장하였습니다)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String nickName = br.readLine();
				System.out.println(nickName+"님이 입장했습니다.");
				
			}
//				GameThread gt = new GameThread(socket,socketList);
//				Thread thread = new Thread(gt);
//				thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// port open
		GameServer ss = new GameServer(9999);

	}

}
