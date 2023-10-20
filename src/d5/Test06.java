package d5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test06 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("first", "one"));
		list.add(new Student("second", "two"));
		list.add(new Student("third", "three"));

		list.add(new Student("Tfirst", "one"));
		list.add(new Student("Tsecond", "two"));
		list.add(new Student("Sthird", "three"));

		Map<Boolean, List<Student>> exam = list.stream()
				.collect(Collectors.groupingBy(s -> s.getName().startsWith("T")));
		
		System.out.println(exam);

		List<Student> test = list.stream()
				// 이름이 d로 끝나니?
				.filter(s -> s.getName().endsWith("d"))
//				.collect(Collectors.toList());
				.toList();

		test.stream().forEach(s -> {
			System.out.println(s);
		});
	}

}
