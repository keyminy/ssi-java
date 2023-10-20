package d5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import d5.ExampleOne.Member;

public class TestSeven {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동",18,"seoul"));
		list.add(new Member("박길동",22,"busan"));
		list.add(new Member("이길동",45,"seoul"));
		list.add(new Member("김길동",28,"jeonju"));
		list.add(new Member("장길동",30,"daegu"));
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(m -> {
			System.out.println(m.getAge());
		});
		
		//Member 클래스에 있는 이름을 기준으로 정렬하려면?..
		list.stream()
		.sorted((one,two) -> {
			return one.getName().compareTo(two.getName());
		})
		.forEach(m -> {
			System.out.println(m.getName());
		});

	}
	static class Member implements Comparable<Member>{
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

		@Override
		public int compareTo(Member o) {
			// 나이로 비교할께요
			return Integer.compare(age, o.age);
		}
	}
}
