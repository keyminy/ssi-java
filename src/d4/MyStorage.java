package d4;

import java.util.ArrayList;

public class MyStorage {
	private ArrayList<String> list = new ArrayList<>();
	
	public void print() {
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void push(String data) {
		list.add(data);
		System.out.println(data + " :: 추가");
	}
	
	public String pop() {
		int lastIndex = list.size()-1;
		String data = list.remove(lastIndex);
		System.out.println(data + " :: 사용");
		return data;
	}
}
