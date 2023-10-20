package test_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread implements Runnable {
	
	private Socket socket;
	//서버에서 전달받아 Client에게 문제 출력
	private BufferedReader sbr;
	private BufferedReader keyboard;
	PrintWriter pw;
	
	public ClientThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {

		try {
			sbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				System.out.println(sbr.readLine());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
