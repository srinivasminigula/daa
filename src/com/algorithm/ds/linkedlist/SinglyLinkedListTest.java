/**
 * 
 */
package com.algorithm.ds.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srinivasminigula
 *
 */
public class SinglyLinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.show();
		list.size();
		list.addAtIndex(0, 4);
		list.show();
		list.size();
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(88);
		list2.add(2);
		list2.add(3);
		list2.add(13);
		System.out.println(list2);

	}
}

class LinkedList<E> {
	Node<E> head;
	static int size;

	public void add(E data) {
		Node<E> node = new Node<>(data);
		if (head == null) {
			head = node;
		} else {
			// traverse through head till last element
			Node<E> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		incrementSize();
	}

	public void addAtBegining(E data) {
		Node<E> node = new Node<>(data);
		node.next = head;
		head = node;
		incrementSize();
	}

	public void addAtIndex(int index, E data) {
		if (index == 0) {
			addAtBegining(data);
			return;
		}
		Node<E> node = new Node<>(data);
		Node<E> n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	public void show() {
		Node<E> temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	private void incrementSize() {
		size++;
	}

	private void decrementSize() {
		size--;
	}

	public int size() {
		System.out.println("Size=" + size);
		return size;
	}
}

class Node<E> {
	E data;
	Node<E> next;

	public Node(E i) {
		this.data = i;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}