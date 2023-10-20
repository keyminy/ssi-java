package d5;

public class TestOne {

	public static void main(String[] args) {
		Simple ss = (x,y) -> {
			System.out.println("exam 구현 : " + x + " : "+y);
		};
		ss.exam(1,10);
		
		SimpleTwo stt = (String str) -> {
			return str.concat("xyz");
		};
		
		System.out.println(stt.one("test")); //testxyz

	}

}
