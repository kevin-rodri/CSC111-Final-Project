/*
 * Implementation of a queue using the node class 
 * @author Kevin and Harsh
 */
public class GradeQueue {
	// instance to get the total of nodes in the gradeQueue
	private int numberOfItems;
	// instance of the first node in the queue
	private Node head;
	// instance of the last node in the queue
	private Node tail;

	// adds and assignments to the queue
	public void add(Assignment item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
			tail = newNode;
			numberOfItems++;
		} else {
			tail.setNext(newNode);
			tail = newNode;
			numberOfItems++;
		}
	}

	// will return the head of the queue (assignment)
	public Assignment peek() {
		return head.getItem();
	}

	// will remove and returns the an assignment in front of the head
	public Assignment poll() {
		if (head != null) {
			Assignment temp = head.getItem();
			head = head.getNext();
			numberOfItems--;
			return temp;
		} else {
			return null;
		}
	}

	// returns the size of the queue
	public int size() {
		return numberOfItems;
	}

// neatly prints out the queue 
	public void print() {
		Node temp = head;
		System.out.print("[");
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print(temp.getItem());
			temp = temp.getNext();
			if (i != numberOfItems - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
}
