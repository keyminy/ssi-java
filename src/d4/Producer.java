package d4;

public class Producer implements Runnable{

	private MyStorage storage;
	String[] dataList = {"a","b","c","d","e"};
	String name;
	
	public Producer(MyStorage storage,String name) {
		super();
		this.storage = storage;
		this.name = name;
	}

	@Override
	public void run() {
		//매개변수 : 이 block안에 들어올 수 있는 열쇠가 어디 있냐?
		//객체가 생성되면 lock name이라는 key가 있다.
		//해당 key를 synchronized block의 열쇠로 사용 가능하다
		synchronized (storage) {
			for(int i=0;i<10;i++) {
				System.out.println("-----" + name + " ----");
				int index = (int)(Math.random() * dataList.length);
				storage.push(dataList[index]);			
				try {
					Thread.sleep((int)(Math.random() * 100));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
