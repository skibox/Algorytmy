package Zajecia1003.Watki.ProducentKonsument;

public class Demo {
	public static void main(String[] args) {
		Processor processor = new Processor();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						processor.produce();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						processor.consume();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
