package Zajecia0402.Kopiec;

public class Heap {
	private int[] heap = new int[15];
	private int n = 0; // rozmiar bieżący kopca
	
	public void addElementToHeap(int element) {
		int newElementIndex = n;
		n++;
		int parentIndex = Math.floorDiv(newElementIndex - 1, 2);
		
		while(newElementIndex > 0 && heap[parentIndex] < element) {
			heap[newElementIndex] = heap[parentIndex];
			newElementIndex = parentIndex;
			parentIndex = Math.floorDiv(newElementIndex - 1, 2);
		}

		heap[newElementIndex] = element;
	}
	
	public int deleteElement() {
		if (n > 0) {
			int parentValue = heap[0];
			n--;
			int lastElement = heap[n];
			int parentIndex = 0;
			int sonIndex = 1;
			
			while(sonIndex < n) {
				if(sonIndex + 1 < n && heap[sonIndex + 1] > heap[sonIndex]) 
					sonIndex++;
				
				if(lastElement > heap[sonIndex]) 
					break;
				
				heap[parentIndex] = heap[sonIndex];
				parentIndex = sonIndex;
				sonIndex = 2*sonIndex + 1;
			}
			heap[parentIndex] = lastElement;
			return parentValue;
			
		}
		return -1;
		
	}
	
	public void dismantleHeap() {
		int[] sortedArray = new int[n];
		for(int i = n - 1; i >= 0; i--) {
			sortedArray[i] = deleteElement();
		}
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
	
	public void printAllElements() {
		for (int i = 0; i < heap.length; i++) {
			System.out.printf("%d: %d\n", i, heap[i]);
		}
	}
}
