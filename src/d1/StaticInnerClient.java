package d1;

public class StaticInnerClient {

	public static void main(String[] args) {
		System.out.println(OuterTwo.abc);
		
		//현재 나는 OuterTwo 객체를 생성한 적 없다.
		OuterTwo.InnerTwo inner = new OuterTwo.InnerTwo();
		inner.innerTest(); //static inner클래스의 메소드 사용
	
		//로컬 이너 클래스 사용하기
		OuterTwo outer = new OuterTwo();
		outer.sample();//로컬이너클래스가 발생할 수 있도록 함
	
		//익명의 Inner Class
		First first = new First() {
			//overriding함
			@Override
			public void two() {
				System.out.println("--- ㅋㅋㅋㅋㅋㅋ");
			}
		};
		first.two(); //--- ㅋㅋㅋㅋㅋㅋ

	}

}
