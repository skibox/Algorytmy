package Zajecia0302.MyList;

public class MyListDemo {
	public static void main(String[] args) throws Exception {
		MyList newList = new MyList();
		newList.addElementAtBeginning(10);
		newList.addElementAtBeginning(10);
		newList.addElementAtBeginning(10);
		newList.addElementAtBeginning(10);
		newList.addElementAtEnd(110);
		newList.addElementAtEnd(111);
		newList.addElementAtEnd(112);
		newList.addElementAtEnd(113);
		System.out.println();
		System.out.println(newList.toString());
		newList.addElementAfter(1500100900, 10);
		System.out.println(newList.toString());
		newList.addElementAfter(314, 113);
		System.out.println(newList.toString());
		newList.addElementBefore(6969, 10);
		System.out.println(newList.toString());
		newList.deleteElement(6969);
		System.out.println(newList.toString());
		newList.deleteElement(110);
		System.out.println(newList.toString());
		newList.deleteElement(314);
		System.out.println(newList.toString());
	}

}
