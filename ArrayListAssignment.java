/*
 * Class to store a list of assignments 
 * @author Kevin Rodriguez
 */
public class ArrayListAssignment  {

	// instance of an array of assignments to do an array list implementation
	private Assignment[] array;
	// will keep track of items in array 
	private int numberOfItems;

	// default constructor to be instantiated in a separate class 
	public ArrayListAssignment() {
		array = new Assignment[5];
	}

	// add an assignment to the arraylist and will expand the size if needed 
	public void add(Assignment item) {
		if (numberOfItems < array.length) {
			array[numberOfItems++] = item;
		} else {
			Assignment[] arr = new Assignment[(int) (1.5 * array.length)];
			for (int i = 0; i < array.length; i++) {
				arr[i] = array[i];
				
			}
			arr[numberOfItems++] = item;
			array = arr;
		}
	}


	// get an assignment at a specific index 
	public Assignment get(int index) {
		return array[index];
	}

	// setting a specific assignment at a certain index
	public void set(int index, Assignment item) {
		array[index] = item;
	}
	
	// removes an assignment from the arrayList 
	public void remove(int index) {
		for (int i = index; i < numberOfItems; i++) {
			array[i] = array[i + 1];
		}
		numberOfItems--;
	}

	// will return the size of the arrayList 
	public int size() {
		return numberOfItems;
	}

	// will neatly print out the entire arraylist of assignments
	public void print() {
		if (numberOfItems == 0) {
			System.out.print("[]");
		} else {
			System.out.print("[");
			for (int i = 0; i < numberOfItems; i++) {
					System.out.print(array[i]);
					if (i != numberOfItems - 1 ){
						System.out.print(",");
					}
			}
			System.out.print("]");
		}
	}

}
