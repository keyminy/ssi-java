package d2;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<Exam> set = new TreeSet<>();
		set.add(new Exam("zone",10));
		set.add(new Exam("two",20));
		set.add(new Exam("three",5));
		System.out.println(set);
		
		System.out.println(set.higher(new Exam("test",50)));;
		
		TreeMap<String, String> strList = new TreeMap<>();
		strList.put("1", "1111");
		strList.put("3", "aaa");
		strList.put("10", "zzz");
		System.out.println(strList);
	}

}
