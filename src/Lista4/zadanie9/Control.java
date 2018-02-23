package Lista4.zadanie9;


public class Control {
	public static void main(String[] args) throws InterruptedException {
		Time time = new Time(5,1,30);
		System.out.println(time);
		
		for(int i = 0; i < 3600; i++) {
			time = time.nextSecond(time);
			System.out.println(time.toString());
			Thread.sleep(100);
		}
	}

}
