package com.binarytree.binarytreebylinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
	BinaryNode root;
	
	public BinaryTreeByLinkedList() {
		this.root = null;
	}
	
	void insert(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		
		if (root == null) {
			root = node;
			System.out.println("Succesfully inserted new node at root!");
			return;
		}
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
		}
	}
	
}
