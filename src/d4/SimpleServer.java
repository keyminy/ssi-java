package d4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SimpleServer {

	private ServerSocket ss;
	private ArrayList<Socket> socketList = new ArrayList<>();
	
		
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
				//accept하면 
				socketList.add(s);

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
	
	public void broadcast(String msg) {
		for(int i=0;i<socketList.size();i++) {
			Socket sk = socketList.get(i);
			System.out.println("===> client로 전송");
			try {
				//auto flush까먹기 쉽다!!조심..
				PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
				pw.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	class ServerThread implements Runnable{

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
					broadcast(data); //모든 client에게 data전송
					data = br.readLine();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
