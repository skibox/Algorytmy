package Zajecia1003.Watki.Runnable;

public class MyRun implements Runnable {
	private int id;
	private int counter = 0;

	public MyRun(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter++;
			
			System.out.println("<<Watek " + id + ">> Wita po raz " + counter);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("<<Watek " + id + ">> Żegna!");

	}

}
