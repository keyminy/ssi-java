package test_2;

import java.util.ArrayList;

public class Game {
	private ArrayList<Quiz> list = new ArrayList<Quiz>();
	private static Game game = new Game();
	
	// 총 5개의 문제를 list에 추가한다.
	private Game() {
		list.add(new Quiz("대한민국의 수도는?", "서울", "인천", "부산", "대구"));
		list.add(new Quiz("중국의 수도는?", "북경", "동경", "남경", "서경"));
		list.add(new Quiz("일본의 수도는?", "동경", "북경", "남경", "서경"));
		list.add(new Quiz("미국의 수도는?", "워싱턴", "뉴욕", "로스엔젤레스", "샌프란시스코"));
		list.add(new Quiz("스페인의 수도는?", "마드리드", "바르셀로나", "리옹", "지브롤터"));
	}
	
	public static Game newInstance() {
		return game;
	}
	
	public Quiz getQuiz(int index) {
		return list.get(index);
	}

	public ArrayList<Quiz> getList() {
		return list;
	}

	public void setList(ArrayList<Quiz> list) {
		this.list = list;
	}
	
}

