package d1;

public class OuterOne {
	private int number;
	
	class InnerOne {
		int number = 100;
		public void innerOneTest() {
			int number = 500;
			setNumber(123);
			System.out.println("=== inner one === : " + number);
			System.out.println(number);
			System.out.println(this.number);
			//OuterOne클래스의 number를 찍고싶다면?..
			System.out.println(OuterOne.this.number);
		}
	}
	
	public InnerOne getInnerOne() {
		return new InnerOne();
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
}
