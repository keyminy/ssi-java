package d2;

public class BoxingTest {

	public static void main(String[] args) {
		Integer two = 10; //boxing
		Integer three = new Integer(10); //boxing
		System.out.println(two);
		System.out.println(three);
		
		int four = new Integer(10).intValue(); //unboxing
		System.out.println(four);
	}

}
