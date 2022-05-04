
public class Node {
	private Node next;
	private String item;
	
	public Node(String item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Node [next=" + next + ", item=" + item + "]";
	}
	
	
}
