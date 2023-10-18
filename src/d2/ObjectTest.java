package d2;

public class ObjectTest {

	public static void main(String[] args) {
		Sample s = new Sample("abc",1);
		Sample ss = new Sample("abc",1);
		
		//stack영역의 주소값을 비교
		System.out.println(s==ss);
	}

}
