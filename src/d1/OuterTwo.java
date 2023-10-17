package d1;

public class OuterTwo {
	int number = 100;
	static String abc = "test";
	
	static class InnerTwo {
		public void innerTest() {
			System.out.println("-=-=- static inner method : " + abc);
		}
	}
	
	public void sample() {
		//로컬이너 클래스(메소드 내부에 선언되는 클래스)
		//메서드 내부에서 잠깐 사용하고 버리는 용도
		class InnerThree{
			public void innerSample() {
				System.out.println("--- local inner");
			}
		}
		
		InnerThree three = new InnerThree();
		three.innerSample();
	}
}
