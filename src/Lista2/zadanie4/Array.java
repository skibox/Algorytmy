package Lista2.zadanie4;

public class Array {
	public static void main(String[] args) {

		System.out.println("Zadanie 1: \n");
			int[] array1 = new int[10];
			
			for(int i = 0; i < 10; i++) {
				array1[i] += 101 + i;
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.print(array1[i] + "\t");
			}
			System.out.println("\n\n");
	
		System.out.println("Zadanie 2: \n");
			int[] array2 = new int[10];
			
			for(int i = 0; i < 10; i++) {
				array2[i] += 10 * (i+1);
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.print(array2[i] + "\t");
			}
			System.out.println("\n\n");
		
		System.out.println("Zadanie 3: \n");
			boolean[] array3 = new boolean[20];
			
			for(int i = 0; i < 20; i++) {
				if(i%2 == 0) array3[i] = true;
				else array3[i] = false;
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.print(i + ". " + array3[i] + " ");
			}
			System.out.println();
			for(int i = 10; i < 20; i++) {
				System.out.print(i + ". " + array3[i] + " ");
			}
			System.out.println("\n\n");
			
		System.out.println("Zadanie 4: \n");
			int[] array4 = new int[100];
			
			for(int i = 0; i < 10; i ++) {
				for(int j = 0; j < 10; j++) {
					array4[10*i+j] = j;
				}
			}
			for(int i = 0; i < 10; i ++) {
				for(int j = 0; j < 10; j++) {
					System.out.print(array4[10*i+j] + "\t");
				}
				System.out.println();
			}
			System.out.println("\n\n");
			
		System.out.println("Zadanie 5: \n");
			char[] array5 = new char[26];
			for(int i = 0; i < 26; i++) {
				array5[i] = (char)(97 + i);
			}
			for(int i = 0; i < 26; i++) {
				System.out.print(array5[i] + " ");
			}
	
	}
}
