package com.algorithm.ds.tree;

public class BinaryTreeTest {

	public BinaryTreeTest() {
	}

	public static void main(String[] args) {

		BinaryTree root = new BinaryTree(12);
		root.insert(10);
		root.insert(5);
		root.insert(15);
		root.insert(8);
		System.out.println(root);
		root.show();
	}
}

class BinaryTree {
	private BinaryTree left;
	private int data;
	private BinaryTree right;

	public BinaryTree(int i) {
		this.data = i;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new BinaryTree(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(value);
			} else {
				right.insert(value);
			}
		}

	}

	public void show() {
		System.out.println(data);
	}

	public BinaryTree() {
		super();
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BinaryTree [left=" + left + ", data=" + data + ", right=" + right + "]";
	}

}