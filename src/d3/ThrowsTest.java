package d3;

public class ThrowsTest {

	public static void main(String[] args) {
		System.out.println("--- 1. main start");
		try {
			one();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("--- 1.main end");
	}
	
	public static void one() throws NullPointerException {
		System.out.println(" --- 2. one start");
		two();
		System.out.println(" --- 2.one end");
	}
	public static void two() throws NullPointerException{
		System.out.println(" --- 3.two start");
		String s = null;
		s.concat("xyz");
		System.out.println(" --- 3.two end");
	}

}
