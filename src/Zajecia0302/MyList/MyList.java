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
		
		while(currentElement != null) {
			if(currentElement.getData() == value)
				return currentElement;
			currentElement = currentElement.getNext();
		}
		
		return null;
		
	}
	
	public Element findBackward(int value) {
		Element currentElement = head;
		
		while(currentElement != null) {
			if(currentElement.getData() == value)
				return currentElement;
			currentElement = currentElement.getPrev();
		}
		
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
	
	public void addElementAfter(int value, int afterWhat) throws Exception{
		Element elementAfter = findForward(afterWhat);
		Element newElement = new Element();
		newElement.setData(value);
		
		if (elementAfter == null) {
			throw new Exception("Nie ma takiej wartości.");
		}
		else if(elementAfter == tail) {
			addElementAtEnd(value);
		}
		else {
			newElement.setNext(elementAfter.getNext());
			newElement.setPrev(elementAfter);
			
			elementAfter.setNext(newElement);
			newElement.getNext().setPrev(newElement);
			counter++;
		}
		
	}
	
	public void addElementBefore(int value, int beforeWhat) throws Exception{
		Element elementBefore = findForward(beforeWhat);
		Element newElement = new Element();
		newElement.setData(value);
		
		if (elementBefore == null) {
			throw new Exception("Nie ma takiej wartości.");
		}
		else if(elementBefore == head) {
			addElementAtBeginning(value);
		}
		else {
			newElement.setNext(elementBefore);
			newElement.setPrev(elementBefore.getPrev());
			
			elementBefore.setPrev(newElement);
			newElement.getPrev().setNext(newElement);
			counter++;
		}
	}
	
	public void deleteElement(int value) {
		Element elementToDelete = findForward(value);
		
		if(elementToDelete == head) {
			head = head.getNext();
			head.setPrev(null);
		}
		else if(elementToDelete == tail) {
			tail = tail.getPrev();
			tail.setNext(null);
		}
		else{
			elementToDelete.getNext().setPrev(elementToDelete.getPrev());
			elementToDelete.getPrev().setNext(elementToDelete.getNext());
		}
		counter--;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		
		Element currentElement = head;
		
		while(true) {
			
			sBuilder.append(currentElement.getData() + " ");
			if(currentElement.getNext() == null) break;
			currentElement = currentElement.getNext();
			
		} 
		
		return sBuilder.toString();	
	}
	
	
}
