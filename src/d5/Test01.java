package d5;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] dataList = { 1, 2, 3, 4, 5 };

		int result = Arrays.stream(dataList)
				// peek은 최종 처리가 아닙니다.
				.peek(num -> System.out.println(num)).sum() // 최종처리
		;
		System.out.println(result);
	}

}
