package d5;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[] dataList = {1,2,4,8,16};
		
		int sum = Arrays.stream(dataList).sum();
		
		System.out.println(sum);
		
		double avg = Arrays.stream(dataList)
				.average() // OptionalDouble
				.getAsDouble(); //double로 반환
		System.out.println(avg);
	}

}
