
public class Node {
	private Node next;
	private Assignment item;
	
	public Node(Assignment item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Assignment getItem() {
		return item;
	}

	public void setItem(Assignment item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Node [next=" + next + ", item=" + item + "]";
	}
	
	
}
