package d4;

public class StorageTest {

	public static void main(String[] args) {
		MyStorage storage = new MyStorage();
		
		//쓰레드 객체 생성
		Producer p1 = new Producer(storage,"P-1");
		Producer p2 = new Producer(storage,"P-2");
		
		Consumer c1 = new Consumer(storage,"C-1");
		Consumer c2 = new Consumer(storage,"C-2");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(c1);
		Thread t4 = new Thread(c2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			Thread.sleep(3000);
			storage.print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
