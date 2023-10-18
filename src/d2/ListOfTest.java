package d2;

import java.util.List;

public class ListOfTest {

	public static void main(String[] args) {
		List<Integer> dataList = List.of(1,2,3,4,5,6,7);
//		dataList.add(10);
		dataList.remove(0);
		System.out.println(dataList);
	}

}
