package Zajecia0302.MyList;

public class Element {
	private Element next;
	private Element prev;
	private int 	data;
	
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	public Element getPrev() {
		return prev;
	}
	public void setPrev(Element prev) {
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
}
