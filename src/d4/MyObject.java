package d4;

public class MyObject implements Runnable{

	int sum = 0;
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10까지 합 : " + sum);
	}

}
