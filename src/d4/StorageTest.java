package d4;

public class StorageTest {

	public static void main(String[] args) {
		MyStorage storage = new MyStorage();
		
		//쓰레드 객체 생성
		Producer p1 = new Producer(storage,"P-1");
		Producer p2 = new Producer(storage,"P-2");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(3000);
			storage.print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
