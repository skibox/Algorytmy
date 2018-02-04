package Zajecia0402.Kopiec;

public class HeapDemo {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.addElementToHeap(15);
		heap.addElementToHeap(6);
		heap.addElementToHeap(3);
		heap.addElementToHeap(8);
		heap.addElementToHeap(34);
		heap.addElementToHeap(1);
		heap.printAllElements();
		System.out.println("========================");
		heap.deleteElement();
		heap.printAllElements();
		System.out.println("========================");
		heap.deleteElement();
		heap.printAllElements();
		System.out.println("========================");
		heap.deleteElement();
		heap.printAllElements();
		
		
	}

}
