package d5;

public class TestOne {

	public static void main(String[] args) {
		Simple ss = (x,y) -> {
			System.out.println("exam 구현 : " + x + " : "+y);
		};
		ss.exam(1,10);
	}

}
