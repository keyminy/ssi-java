package d5;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		int[] dataList = {1,2,3};
		
		int result = Arrays.stream(dataList)
		.reduce(0,(a,b) -> (a*a) + (b*b));
		// (0*0) + (1*1) = 1
		// (1*1) + (2*2) = 4
		// (5*5) + (3*3) = 25+9 = 34
		System.out.println(result);
	}

}
