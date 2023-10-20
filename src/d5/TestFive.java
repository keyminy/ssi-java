package d5;

import java.util.Arrays;

public class TestFive {

	public static void main(String[] args) {
		int[] dataList = {1,2,3,4,5};
		
		Arrays.stream(dataList)
		.forEach(System.out::println);
		
		Arrays.stream(dataList)
		.asDoubleStream() // DoubleStream로 변환
		.forEach(System.out::println);
	}

}
