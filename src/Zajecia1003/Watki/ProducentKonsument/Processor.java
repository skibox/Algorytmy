package Zajecia1003.Watki.ProducentKonsument;

import java.util.Scanner;

public class Processor {
//	final Object lock1 = new Object();
//	final Object lock2 = new Object();
	
	public void consume() throws InterruptedException{
		synchronized (this) {
			System.out.println("Producer thread running");
			wait(2000);
			System.out.println("Producer thread resumed");
		}
	}
	
	public void produce() throws InterruptedException{ 
		Scanner scan = new Scanner(System.in);
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Waiting for enter");
			scan.nextLine();
			System.out.println("Consumed!");
			notifyAll();
		}
	}
}
