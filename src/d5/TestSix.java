package d5;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSix {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one,two,three");
		list.add("four,five");
		
		list.stream()
		//현재 내가 받은 데이터를 짜를거에요
		.flatMap(data -> {
			String[] strList = data.split(",");
			return Arrays.stream(strList);
		})
		.forEach(System.out::println);
	}

}
