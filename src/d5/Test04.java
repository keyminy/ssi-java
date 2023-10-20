package d5;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Test04 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// sum()은 IntStream에 있다.
//		System.out.println(list.stream().mapToInt(i -> i.intValue()).sum());

		// Optional쓰기
		OptionalDouble oo = list.stream()
				.mapToInt(i -> i.intValue())
				.average();
		if(oo.isPresent()) {
			//oo가 가지고있는 값 -> double로 반환
			System.out.println(oo.getAsDouble());
		}else {
			System.out.println("0.0");
		}
		
		System.out.println("----------------");
		
		double od = list.stream()
				.mapToInt(i -> i.intValue())
				.average()
				.orElse(0.0);
		//orElse : 값이없으면 0.0찍게함
		System.out.println(od);
	}

}
