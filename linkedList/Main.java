package linkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {


	private static class Node<T> {
		private T value;
		private Node next;

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}

		public Node(T value) {
			this(value, null);
		}

		public Node() {}

		public void value(T value) {
			this.value = value;
		}

		public T value() {
			return value;
		}

		public Node next() {
			return next;
		}

		public void next(Node next) {
			this.next = next;
		}
	}

	public static Node<Integer> removeDuplicates(Node<Integer> head) {

		Node<Integer> it = head;
		while(it.next() != null) {
			if(it.next().value().equals(it.value())) {
				it.next(it.next().next());
			} else {
				it = it.next();
			}

		}

		return head;
	}

	public static Node<Integer> rotate(Node<Integer> head, int k) {
		if(k == 0) {
			return head;
		}
		int size = 0;
		Node<Integer> it = head;
		while(it.next() != null) {
			size++;
			it = it.next();
		}
		System.out.println(size);
		int aux = k % size;
		System.out.println("K e " + aux);

		it = head;
		Node newHead = new Node();
		Node tail = new Node();
		for(int i = 0; i < size; i++) {
			if(i == size - k) {
				newHead = it.next();
				it.next(null);
				it = newHead;
				System.out.println(it.value());
				System.out.println(newHead.value());
			} else {
				it = it.next();
			}
			if(i == size - 1) {
				tail = it;
			}
		}
		tail.next(head);
		return newHead;
	}

	public static void iterate(Node head) {
		Node it = head;
		while(it != null) {
			System.out.print(it.value() + " ");
			it = it.next();
		}
	}

	public static Node generate(int[] val) {
		Node head = new Node();
		Node it = head;
		for (int el : val) {
			Node newNode = new Node(el);
			it.next(newNode);
			it = it.next();
		}

		return head.next();
	}

	public static ListNode mergeList(ListNode list1, ListNode list2) {
		ListNode newHead = new ListNode();
		ListNode it = newHead;

		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				it.next = list2;
				list1 = list1.next;
			} else {
				it.next = list2;
				list1 = list1.next;
			}
		}

		return list1;
	}
	
	public static void removeDuplicates(LinkedList<Integer> list) {
		ListIterator<Integer> it = list.listIterator();
		int aux = it.next();
		while(it.hasNext()) {
			if(it.next() == aux) {
				it.remove();
			} else {
				aux = it.previous();
				if(it.hasNext()) {
					it.next();
				}
				
			}
		}
	}
	
	public static void removeDuplicates2(LinkedList<Integer> list) {
		ListIterator<Integer> it = list.listIterator();
		int aux = it.next();
		while(it.hasNext()) {
			if(it.next() == aux) {
				if(it.hasPrevious()){
					it.previous();
				}
				if(it.hasPrevious()){
					it.previous();
				}
				
				while(it.hasNext() && it.next() == aux) {
					it.remove();
				}
			} else {
				aux = it.previous();
				System.out.println("Aux e " + aux);
				if(it.hasNext()) {
					it.next();
				}
				
			}
		}
	}
	
	

	public static void main(String[] args) {
		OrderedList<String> orderedTownsList = new OrderedList<>();

		// populate list with towns:
		orderedTownsList.addInOrderedList("Suceava");
		orderedTownsList.addInOrderedList("Cluj");
		orderedTownsList.addInOrderedList("Targu Jiu");
		orderedTownsList.addInOrderedList("Bucuresti");

		System.out.println(orderedTownsList);

		orderedTownsList.addInOrderedList("Brasov");
		orderedTownsList.addInOrderedList("Bacau");
		orderedTownsList.addInOrderedList("Suceava");
		orderedTownsList.addInOrderedList("Bucuresti");
		orderedTownsList.addInOrderedList("Brasov");
		orderedTownsList.addInOrderedList("Brasov");

		System.out.println(orderedTownsList);
		
		Town Timisoara = new Town("Timisoara", 100);
		Town Arad = new Town("Arad", 150);
		Town Bucuresti = new Town("Bucuresti", 0);
		Town Ploiesti = new Town("Ploiesti", 30);
		
		OrderedList<Town> towns = new OrderedList<Town>();
		
		towns.addInOrderedList(Timisoara);
		towns.addInOrderedList(Arad);
		towns.addInOrderedList(Bucuresti);
		towns.addInOrderedList(Ploiesti);
		
		System.out.println(towns);
		System.out.println();
		Deque<Integer> aux123 = new ArrayDeque<Integer>();
		
		LinkedList<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(2);

		intList.add(3);
		intList.add(4);
		intList.add(4);
		intList.add(4);
		removeDuplicates2(intList);
		ListIterator iterator = intList.listIterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

}
