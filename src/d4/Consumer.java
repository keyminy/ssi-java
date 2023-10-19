package d4;

public class Consumer implements Runnable {

	private MyStorage storage;
	private String name;

	public Consumer(MyStorage storage, String name) {
		super();
		this.storage = storage;
		this.name = name;
	}

	@Override
	public void run() {
		synchronized (storage) {

			while (true) {
				if (storage.getList().size() == 0) {
					System.out.println(name + " 님 쉬세요...");
					try {
						storage.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("==== " + name + " ====");
				storage.pop();
			}
		}
	}
}
