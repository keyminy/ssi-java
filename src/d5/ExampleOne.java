package d5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOne {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동",18,"seoul"));
		list.add(new Member("박길동",22,"busan"));
		list.add(new Member("이길동",45,"seoul"));
		list.add(new Member("김길동",28,"jeonju"));
		list.add(new Member("장길동",30,"daegu"));
		
		
//		list.stream()
//				.map(m -> m.getName())
//				.forEach(System.out::println);
//		list.stream()
//		.mapToInt(m -> m.getAge()) // IntStream
//		.forEach(System.out::println);
		
	}
	
	static class Member{
		private String name;
		private int age;
		private String addr;
		
		public Member(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
		}
		
		
	}

}
