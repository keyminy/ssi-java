package d1;

public class SingletonClient {

	public static void main(String[] args) {
		MySingleton single = MySingleton.getInstance();
		System.out.println(single);
	}

}
