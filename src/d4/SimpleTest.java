package d4;

public class SimpleTest {

	public static void main(String[] args) {
		// 1.실행할 스레드 객체 생성
		MyThread tt = new MyThread("T1");
		MyThread ttt = new MyThread("T2");
		
		//2.쓰레드 라이프사이클에 탑재
		//실행은 start() 메소드
		tt.start();
//		tt.start(); //사용이 끝난 스레드는 다시 사용 불가하다
		//solution : 객체를 하나 더 만들어야한다.
		ttt.start();
		
		System.out.println("========================");
		
		// 1.실행 객체 생성
		MyObject mm = new MyObject();
		
		//2.Thread객체 생성
		Thread thread = new Thread(mm);
		
		//3.라이프 사이클로 이동
		thread.start();

	}

}
