package d1;

public class OneClient {
	public static void main(String[] args) {
		
		Two two_1 = new Two();
		Two two_2 = new Two();
		
		two_1.index++;
		two_1.count++;
		
		System.out.println(two_1.index + " ::: " + two_1.count);
		
		two_2.index++;
		two_2.count++;
		
		System.out.println(two_2.index + " ::: " + two_2.count);
		Two.count++;
		System.out.println(Two.count + " ==> 객체 생성 없이 사용");
		
		System.out.println(Two.second);
	}
}
