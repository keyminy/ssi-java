package d5;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] dataList = {3,6,9};
		
		boolean result = Arrays.stream(dataList)
		.allMatch(num -> num %3 == 0);
		System.out.println(result);
	}

}
