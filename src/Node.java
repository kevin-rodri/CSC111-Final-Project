/*
 * Node class that is used for our queue implementation 
 * @author Harsh Gandhi
 */
public class Node {
	// instance of the next node
	private Node next;
	// instance of an assignment
	private Assignment item;

	// node constructor that will take in an assignment
	public Node(Assignment item) {
		this.item = item;
	}

	// returns the next node
	public Node getNext() {
		return next;
	}

	// ability to set the next node
	public void setNext(Node next) {
		this.next = next;
	}

	// returns the assignment
	public Assignment getItem() {
		return item;
	}

	// ability to set an assignment
	public void setItem(Assignment item) {
		this.item = item;
	}

	// in case the print methods do not work...
	@Override
	public String toString() {
		return "Node [next=" + next + ", item=" + item + "]";
	}

}
