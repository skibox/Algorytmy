package Zajecia1003.Watki.SekcjaKrytyczna;

import java.util.ArrayList;
import java.util.Random;

public class ZarzadzanieLista {
	private ArrayList<Integer> listOne = new ArrayList<>();
	private ArrayList<Integer> listTwo = new ArrayList<>();
	private Random random = new Random();

	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public void stageOne() throws InterruptedException {
		synchronized (lock1) {
			listOne.add(random.nextInt());
			Thread.sleep(1);
		}
	}

	public void stageTwo() throws InterruptedException {
		synchronized (lock2) {
			listTwo.add(random.nextInt());
			Thread.sleep(1);
		}
	}

	public void process() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
}
