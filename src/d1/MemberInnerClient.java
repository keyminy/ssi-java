package d1;


public class MemberInnerClient {

	public static void main(String[] args) {
		OuterOne outer = new OuterOne();
		//OuterOne클래스 안에있는 InnerOne클래스야
		//OuterOne.InnerOne타입으로 받음
		OuterOne.InnerOne inner = outer.new InnerOne();
		inner.innerOneTest(); //호출
		
		OuterOne.InnerOne in = outer.getInnerOne();
		
	}
}
