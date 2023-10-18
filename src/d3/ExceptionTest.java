package d3;

public class ExceptionTest {

	public static void main(String[] args) {
		int age = 15;
		
		if(age < 19) {
			//청소년이면 Exception 발생
//			new MyException(); //이렇게 Exception발생하는게 아니야..
			/*생성한 Exception을 프로그램상에 던져야함*/
			//Unhandled exception type MyException
			// => try-catch로 감싼다
			try {
				throw new MyException();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Welcome....!");
		}
	}

}
