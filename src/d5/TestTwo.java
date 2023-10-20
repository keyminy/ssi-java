package d5;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestTwo {

	public static void main(String[] args) {
		String[] strList = {"a","b","c"};
		
		Stream<String> stream = Arrays.stream(strList);
		
		stream.forEach(x-> System.out.println(x));

	}

}
