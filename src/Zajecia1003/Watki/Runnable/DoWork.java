package Zajecia1003.Watki.Runnable;

public class DoWork{
	int counter = 0;

	public static void main(String[] args) {
		DoWork doWork = new DoWork();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					doWork.counter++;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					doWork.counter++;
				}
			}
		});
		
		t1.run();
		t2.run();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println(doWork.counter);
	}
}
