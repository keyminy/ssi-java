package d5;

import java.util.ArrayList;

public class TestFour {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("k");
		nameList.add("l");
		nameList.add("p");
		nameList.add("y");
		nameList.add("j");
		
		nameList.parallelStream()
			.forEach(name -> {
				System.out.println(name + " :: " + Thread.currentThread());
			});
	}

}
