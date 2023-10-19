package d4;

public class MyThread extends Thread{
	
	private String msg;
	
	public MyThread(String msg) {
		super();
		this.msg = msg;
	}


	@Override
	public void run() {
		for(int i=0; i< 7;i++) {
			System.out.println(msg + " ::: " + i);
			int time = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
