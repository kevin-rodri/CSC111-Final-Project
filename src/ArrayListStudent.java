
public class ArrayListStudent {
	private Student[] array;
	private int numberOfItems;

	public ArrayListStudent() {
		array = new Student[5];
	}

	
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


	public Student get(int index) {
		return array[index];
	}

	
	public void set(int index, Student item) {
		array[index] = item;
	}

	public void remove(int index) {
		for (int i = index; i < numberOfItems; i++) {
			array[i] = array[i + 1];
		}
		numberOfItems--;
	}

	
	public int size() {
		return numberOfItems;
	}

	
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
