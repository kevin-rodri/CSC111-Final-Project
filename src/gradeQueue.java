
public class gradeQueue {
	private int numberOfItems;
	private Node head;
	private Node tail;
	
	public void add(Assignment item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = newNode;
			tail = newNode;
			numberOfItems++;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
			numberOfItems++;
		}
	}
	
	public Assignment peek() {
		return head.getItem();
	}
	public Assignment poll() {
		if(head != null) {
			Assignment temp = head.getItem();
			head = head.getNext();
			numberOfItems--;
			return temp;
		}
		else {
			return null;
		}
	}
	public int size() {
		return numberOfItems;
	}
	public void print() {
		Node temp = head;
		System.out.print("[");
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print(temp.getItem());
			temp = temp.getNext();
			if(i != numberOfItems - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
}
}
