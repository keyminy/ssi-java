package d1;

public class One {
	
	String name;
	private int age;
	String address;
	
	public One(String name) {
		this.name = name;
	}
	
	public One(String name,int age) {
		this(name);
//		this.name = name;
		this.age = age;
	}
	
	public One(String name,int age,String address) {
		this(name,age);
//		this.name = name;
//		this.age = age;
		this.address = address;
		System.out.println("constructor....");
	}
	
	public void One(String name,int age, String address) {
		System.out.println("method.........");
	}
	
	public static void main(String[] args) {
		One one = new One();
		System.out.println(one); //주소가 아닌, hash코드 값이다.
		System.out.println(one.name);
	}

}
