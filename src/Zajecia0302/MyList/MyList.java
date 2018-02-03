package Zajecia0302.MyList;

public class MyList {
	private int counter;
	private Element head;
	private Element tail;
	
	public int getCounter() {
		return counter;
	}
	public Element getHead() {
		return head;
	}
	public Element getTail() {
		return tail;
	}
	
	public Element findForward(int value) {
		Element currentElement = head;
		
		do{
			if(currentElement.getData() == value)
				return currentElement;
			currentElement = currentElement.getNext();
		} while(currentElement.getNext() != null);
		
		return null;	
	}
	
	public Element findFBackward(int value) {
		Element currentElement = tail;
		
		do{
			if(currentElement.getData() == value)
				return currentElement;
			currentElement = currentElement.getPrev();
		} while(currentElement.getPrev() != null);
		
		return null;	
	}
	
	private void setFirstElement(Element newElement) {
		newElement.setNext(null);
		newElement.setPrev(null);
		head = newElement;
		tail = newElement;
		counter++;
	}
	
	public void addElementAtBeginning(int value) {
		Element newElement = new Element();
		newElement.setData(value);
		
		if(counter > 0) {
			newElement.setNext(head);
			newElement.setPrev(null);
			head.setPrev(newElement);
			head.setNext(head.getNext());
			head = newElement;
			
			counter++;
		}
		else 
			setFirstElement(newElement);
	}
	
	public void addElementAtEnd(int value) {
		Element newElement = new Element();
		newElement.setData(value);
		
		if(counter > 0) {
			newElement.setNext(null);
			newElement.setPrev(tail);
			tail.setNext(newElement);
			tail.setPrev(tail.getPrev());
			tail = newElement;
			
			counter++;
		}
		else 
			setFirstElement(newElement);
	}
	
}
