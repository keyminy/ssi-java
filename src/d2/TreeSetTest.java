package d2;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<Exam> set = new TreeSet<>();
		set.add(new Exam("zone",10));
		set.add(new Exam("two",20));
		set.add(new Exam("three",5));
		System.out.println(set);
		
		System.out.println(set.higher(new Exam("test",50)));;
	}

}
