package d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		String[] strList = {"7","9","6","1","2","3","4","5"};
		
		Arrays.sort(strList);
		for(int i=0;i<strList.length;i++) {
			System.out.println(strList[i]);
		}
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(7);
		intList.add(3);
		intList.add(1);
		intList.add(8);
		
		Collections.sort(intList);
		System.out.println(intList);
		
		ArrayList<Sample> sampleList = new ArrayList<>();
		sampleList.add(new Sample("kim",10));
		sampleList.add(new Sample("lee",12));
		sampleList.add(new Sample("park",5));
		sampleList.add(new Sample("jang",50));
		
		Collections.sort(sampleList,new Comparator<Sample>() {
			@Override
			public int compare(Sample o1, Sample o2) {
				//data를 기준으로 정렬(오름차순)
				//[Sample [data=jang, number=50], Sample [data=kim, number=10], Sample [data=lee, number=12], Sample [data=park, number=5]]
//				return o1.getData().compareTo(o2.getData());
				//data기준 정렬(내림차순)
				//[Sample [data=park, number=5], Sample [data=lee, number=12], Sample [data=kim, number=10], Sample [data=jang, number=50]]
				return o2.getData().compareTo(o1.getData());
			}
		});
		
		System.out.println(sampleList.toString());
	}
}
