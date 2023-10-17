package d1;

import java.util.ArrayList;

public class MySingleton {
	
	//class안에서만 new로 객체 생성가능
	private static MySingleton single = new MySingleton();
	private ArrayList<String> dataList = new ArrayList<>();
	
	//생성자를 private하면 -> 외부에서 new로 생성자 호출 불가
	//MySingleton single = new MySingleton(); 불가
	//The constructor MySingleton() is not visible
	private MySingleton() {
		dataList.add("1");
		dataList.add("2");
		dataList.add("3");
	}
	
	//static 메소드 : 객체 생성없이 사용가능
	// -> 사용법 : MySingleton.getInstance();
	public static MySingleton getInstance() {
		return single;
	}
}
