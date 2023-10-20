package d5;

public class ReferenceTestOne {

	public static void main(String[] args) {
		MyCalc mm = new MyCalc();
		
		/* 원래 했던거 */
//		mm.calc((x,y)->{
//				return Math.max(x, y);
//		});
		
		//Math클래스의 max 메소드를 참조함
		//Math의 max는 static 메소드이다.
		mm.calc(Math::max);
		
		/* inner클래스의 myMax 함수를 사용하고 싶을때 */
		ReferenceInner inn = new ReferenceInner();
		mm.calc(inn :: myMax); //inn객체 안에있는 myMax함수
		
//		SimpleFour four = (one,two) -> {
//			return one.equals(two);
//		};
		
		//String은 맨 앞의 매개변수(one)의 type을 써줌
		SimpleFour four = String :: equals;
		
		System.out.println(four.myEquals("aa", "aa"));
	}
	
	static class ReferenceInner {
		public int myMax(int x,int y) {
			return x+y;
		}
	}
}
