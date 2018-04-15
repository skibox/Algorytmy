package PracaDomowax.Zadanie11;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		MyTime newTime1 = new MyTime(23,59,50);
		for(int i = 0; i < 12; i++) {
			System.out.println(newTime1);
			Thread.sleep(1000);
			newTime1 = newTime1.nextSecond();
		}
		
		MyTime newTime2 = new MyTime(0,0,7);
		for(int i = 0; i < 10; i++) {
			System.out.println(newTime2);
			Thread.sleep(1000);
			newTime2 = newTime2.previousSecond();
		}
		
		MyTime newTime3 = new MyTime(12,59,50);
		for(int i = 0; i < 12; i++) {
			System.out.println(newTime3);
			Thread.sleep(1000);
			newTime3 = newTime3.nextSecond();
		}
		
	}
}	
