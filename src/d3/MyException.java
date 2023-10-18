package d3;

public class MyException extends Exception{

	public MyException() {
		super("성인 기준 미달");
		System.out.println(" 사용자 정의 Exception 발생");
	}
	
}
