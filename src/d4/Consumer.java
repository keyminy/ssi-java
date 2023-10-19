package d4;


public class Consumer implements Runnable{

	private MyStorage storage;
	
	public Consumer(MyStorage storage) {
		super();
		this.storage = storage;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			storage.pop();			
		}
	}

}
