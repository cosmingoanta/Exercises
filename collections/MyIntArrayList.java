package collections;
import java.util.Arrays;

public class MyIntArrayList {
	private int[] elements;
	private int size;

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}
	
	public MyIntArrayList(MyIntArrayList c) {
		this(c.size);
		for(int i = 0; i < c.size; i++) {
			this.elements[i] = c.get(i);
		}
		this.size = c.size;
	}

	public int get(int index) {
		return this.elements[index];
	}
	
	public boolean add(int e) {
		if (this.size == this.elements.length - 1) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;

		return true;
	}
	
	public boolean add(int index, int e) {
		if (this.size == this.elements.length - 1) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		this.size++;
		for(int i = this.size(); i > index; i--) {
			this.elements[i] = this.elements[i - 1];
		}
		
		this.elements[index] = e;
		

		return true;
	}

	public int size() {
		return this.size;
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public void print() {
		for(int elem: this.elements) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public boolean contains(int e) {
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i] == e) {
				return true;
			}
		}
		return false;
	}
	
	public int lastIndexOf(int e) {
		if(this.indexOf(e) < 0) {
			return -1;
		}
		int res = -1;
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i] == e) {
				res = i;
			}
		}
		return res;
	}
	
	public boolean remove(int e) {
		if(this.indexOf(e) < 0) {
			return false;
		}
		for(int i = this.indexOf(e); i < this.size; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;
		return true;
	}
	
	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" +
					" remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		for (int i = index; i < this.size; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;

		return removedElement;
	}

	public void clear() {
		this.size = 0;
	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
					" the element " + e + " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}
	
	public boolean addAll(MyIntArrayList c) {
		for(int i = 0; i < c.size; i++) {
			this.add(c.get(i));
		}
	
		return true;
	}
	
	public boolean addAll(int index, MyIntArrayList c) {
		for(int i = 0; i < c.size; i++) {
			this.add(c.get(i));
		}
	
		return true;
	}

}
