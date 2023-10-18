package d2;

public class ObjOne<T> {
	private T t;
	
	//로컬(메소드)에만 일시적으로 제네릭을 선언할 수 있다.
	public <M extends Number> boolean check(M m1,M m2) {
		if(m1 == m2) {
			return true;
		}else {
			return false;
		}
	}
}
