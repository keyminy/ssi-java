package d3;

public class ExampleFive {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합 또는 곱을 구하시오..
//		int result = 0;
//		for(int i=1;i<=10;i++) {
//			result += i;
//		}
//		System.out.println(result);
		sum(10);	
		System.out.println(sumValue);
	}
	static int sumValue;
	
	public static void sum(int num) {
		//탈출조건!!!
		if(num == 0) {
			return;
		}
		sumValue += num;
		sum(num-1);
	}

}
