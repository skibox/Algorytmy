package Lista3.zadanie26;

public class LockerToggle {
	public static boolean toggle(boolean locker) {
		if (locker == true)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		int divisor = 2;
		int openLockerCount = 0;

		for (divisor = 2; divisor <= 100; divisor++) {
			for (int i = 0; i < lockers.length; i++) {
				if (i % divisor == 0)
					lockers[i] = toggle(lockers[i]);

			}
		}
		
		for (int i = 0; i < lockers.length; i++) {
			if(lockers[i] == true) openLockerCount++;
		}
		
		System.out.printf("There are %d open lockers", openLockerCount);
	}
}
