package d2;

public class StringBuilderTest {
	//StringBuilder : 변경 가능한 문자열을 다룰때 사용 
	static StringBuilder sb = new StringBuilder("abcdefg");

	public static void main(String[] args) {
		System.out.println("변경 전 : " + sb);
		
		change();
		
		System.out.println("변경 후 : " + sb);
	}
	
	public static void change() {
		System.out.println(sb.append("xyz"));
		System.out.println(sb.insert(0, "--- "));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 4));
		System.out.println(sb.reverse());
	}
}
