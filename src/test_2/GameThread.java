package test_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameThread implements Runnable {

	private Socket socket;
	private Game game;
	//GameThread : 클라이언트에게 문제 전송 + 답안 확인
	private BufferedReader sbr;
	PrintWriter pw;
	
	public GameThread(Socket socket) {
		this.socket = socket;
		game = Game.newInstance();
	}
	
	@Override
	public void run() {
		try {
			// 쓰기버퍼 : 서버 -> 클라
			OutputStream os = socket.getOutputStream();
			// PrintWriter는 Auto flush기능이 있음 2번째 매개변수에 true
			pw = new PrintWriter(os, true);
			sbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			int score = 0;
			int cnt = 0;
			List<Quiz> list = game.getList();
			Collections.shuffle(list);
			while(cnt < list.size()) {
				System.out.println("size : " + list.size());
				System.out.println("cnt : " + cnt);
				//사용자의 선택지 입력받고..
				for(Quiz quiz : list) {
					cnt++;
					//user에게 퀴즈를 보여줘야하네(write)
					pw.println(quiz);
					//quiz먼저 보여주고 유저 정답 받자..
					String userAnswer = sbr.readLine();
					if(userAnswer.equals(quiz.getAnswer())) {
						pw.println("정답!!!");
						score += 20;
					}else {
						pw.println("오답입니다. ㅠㅠ");						
					}
					pw.println("점수 : " + score + "점");
				}
			}
			pw.println("게임 완료...");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
}
