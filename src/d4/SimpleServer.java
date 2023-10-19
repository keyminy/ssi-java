package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	private ServerSocket ss;
		
	public SimpleServer() {
		this(9999);
	}
	public SimpleServer(int port) {
		try {
			ss = new ServerSocket(port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		serverReady();
	}
	private void serverReady() {
		try {
			while(true) {
				//client가 들어오는지 확인, 들어오면 socket생성
				Socket s = ss.accept(); 

				//클라이언트가 들어오면, Thread생성
				ServerThread st = new ServerThread(s);
				Thread thread = new Thread(st);
				thread.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//port open
		SimpleServer ss = new SimpleServer(9999);
		
	}
	
	static class ServerThread implements Runnable{

		private Socket socket;
		
		public ServerThread(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				//클라이언트가 들어오면, 보낸 정보(메시지) 추출 -> IO가 필요하다
				//socket에서 읽어온 데이터를 읽을 수 있음 getInputStream();
				InputStream is =  socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String data = br.readLine();
				while(data != null) {
					System.out.println("Receive : " + data);
					data = br.readLine();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
