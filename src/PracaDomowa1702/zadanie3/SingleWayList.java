package PracaDomowa1702.zadanie3;

import Zajecia0302.MyList.Element;

public class SingleWayList {
	private int counter;
	private Element head;
	
	public int getCounter() {
		return counter;
	}

	public Element getHead() {
		return head;
	}

	public void addElementAtBeginning(int value) {
		Element newElement = new Element();
		Element lastElement = head;
		newElement.setData(value);
		
		if(counter > 0) {
			while(lastElement.getNext() != head)
				lastElement = lastElement.getNext();
			newElement.setNext(head);
			lastElement.setNext(newElement);
			head = newElement;
			
			counter++;
		}
		else 
			setFirstElement(newElement);
	}
	
	public void addElementAtEnd(int value) {
		Element newElement = new Element();
		Element lastElement = head;
		newElement.setData(value);
		
		if(counter > 0) {
			
			while(lastElement.getNext() != head)
				lastElement = lastElement.getNext();
			
			lastElement.setNext(newElement);
			newElement.setNext(head);
			
			counter++;
		}
		else 
			setFirstElement(newElement);
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
	
	private void setFirstElement(Element newElement) {
		head = newElement;
		newElement.setNext(head);
		counter++;
	}
	
	public void addElementAfter(int value, int afterWhat) throws Exception{
		Element elementAfter = findForward(afterWhat);
		Element newElement = new Element();
		newElement.setData(value);
		
		if (elementAfter == null) {
			throw new Exception("Nie ma takiej wartości.");
		}

		else {
			newElement.setNext(elementAfter.getNext());
			elementAfter.setNext(newElement);
			counter++;
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		
		Element currentElement = head;
		
		while(true) {
			
			sBuilder.append(currentElement.getData() + " ");
			if(currentElement.getNext() == head) break;
			currentElement = currentElement.getNext();
			
		} 
		
		return sBuilder.toString();	
	}
}
