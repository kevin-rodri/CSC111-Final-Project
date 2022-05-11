/*
 * Class to store a list of students 
 * @author Kevin Rodriguez
 */
public class ArrayListStudent {
	// instance of an array of students to do an array list implementation
	private Student[] array;
	// will keep track of items in array
	private int numberOfItems;

	// default constructor to be instantiated in a separate class
	public ArrayListStudent() {
		array = new Student[5];
	}

	// add a student to the arraylist and will expand the size if needed
	public void add(Student item) {
		if (numberOfItems < array.length) {
			array[numberOfItems++] = item;
		} else {
			Student[] arr = new Student[(int) (1.5 * array.length)];
			for (int i = 0; i < array.length; i++) {
				arr[i] = array[i];

			}
			arr[numberOfItems++] = item;
			array = arr;
		}
	}

	// get a student at a specific index
	public Student get(int studentName) {
		return array[studentName];
	}

	// setting a specific student at a certain index
	public void set(int index, Student item) {
		array[index] = item;
	}

	// removes a student from the arrayList
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

	// will neatly print out the entire arraylist of students
	public void print() {
		if (numberOfItems == 0) {
			System.out.print("[]");
		} else {
			System.out.print("[");
			for (int i = 0; i < numberOfItems; i++) {
				System.out.print(array[i]);
				if (i != numberOfItems - 1) {
					System.out.print(",");
				}
			}
			System.out.print("]");
		}
	}

}
