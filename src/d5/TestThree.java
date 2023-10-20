package d5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestThree {

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,7,8,9};
		
		//IntStream형태 반환됨
		IntStream stream =  Arrays.stream(list);
		stream.filter(num -> num %2 ==0)
			.forEach(n -> System.out.println(n));
		
//		System.out.println(stream.count());
	}

}
