package test_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GameThread implements Runnable {

	private Socket socket;
	private Game game;
	
	public GameThread(Socket socket) {
		this.socket = socket;
		game = Game.newInstance();
	}
	
	@Override
	public void run() {

	}
	
}
