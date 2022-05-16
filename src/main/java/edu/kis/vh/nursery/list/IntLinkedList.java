package edu.kis.vh.nursery.list;

public class IntLinkedList {
	/**
	 * klasa reprezentująca listę składającą się z węzłow
	 */

	private static class Node {

		/**
		 * klasa reprezentująca węzeł
		 * składa się z wartości węzła, węzła reprezentującego poprzedni węzeł
		 * i węzła reprezentującego następny węzeł
		 */
		private final int value;
		protected Node prev, next;

		/**
		 * public Node(int i)
		 * konstruktor węzła który przypisuje mu wartość
		 */
		public Node(int i) {

			value = i;

		}
		/**
		 * public int getValue()
		 * funkcja zwraca wartość z węzła
		 */
		public int getValue() {

			return this.value;
		}
	}

	Node last;

	/**
	 * 	public void push(int i)
	 * funkcja dodaje nowy węzeł na koniec listy i przypisuje mu wartość
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}


	/**
	 * 	public boolean isEmpty()
	 * funkcja infromuje czy lista jest pusta
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * 	public boolean isFull()
	 * funkcja infromuje czy lista jest pełna
	 */
	public boolean isFull() {
		return false;
	}


	/**
	 * 	public int top()
	 * funkcja zwraca wartość z początku listy
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/**
	 * 	public int top()
	 * funkcja zwraca wartość z końca listy i usuwa węzeł
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

}

// klasa node została usunięta i została klasą wewnętrzną by mogła być prywatna