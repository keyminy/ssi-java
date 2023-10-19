package d4;

public class SimpleTest {

	public static void main(String[] args) {
		// 1.실행할 스레드 객체 생성
		MyThread tt = new MyThread();
		
		//2.쓰레드 라이프사이클에 탑재
		//실행은 start() 메소드
		tt.start();

	}

}
