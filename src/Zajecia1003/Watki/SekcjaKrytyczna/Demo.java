package Zajecia1003.Watki.SekcjaKrytyczna;

public class Demo {
	public static void main(String[] args) {
		DostepDoZasobow zasob = new DostepDoZasobow();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				zasob.increment();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				zasob.increment();
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
		
		zasob.print();
	}
}
