package Zajecia1003.Watki.SekcjaKrytyczna;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		ZarzadzanieLista lista = new ZarzadzanieLista();
		long timeStart1 = System.currentTimeMillis();
		lista.process();
		long timeEnd1 = System.currentTimeMillis();
		
		System.out.println(timeEnd1 - timeStart1);
		
		ZarzadzanieLista lista2 = new ZarzadzanieLista();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					lista2.process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					lista2.process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		long timeStart2 = System.currentTimeMillis();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		lista.process();
		long timeEnd2 = System.currentTimeMillis();
		
		System.out.println(timeEnd2 - timeStart2);
		
	}
}
