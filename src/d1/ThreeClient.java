package d1;

public class ThreeClient {

	public static void main(String[] args) {
		Three t = new Three("첫번째");
//		t.msg = "update"; //final필드라 변경불가
		System.out.println(t.MSG);
		Three tt = new Three("두번째");
		System.out.println(tt.MSG);
		
	}

}
