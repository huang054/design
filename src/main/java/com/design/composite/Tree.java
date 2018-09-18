package com.design.composite;

public class Tree {
	
	private Node node =null;
	public Tree(String name) {
		node = new Node(name);
	}
    public static void main(String[] args) {
		Tree tree = new Tree("A");
		Node node1 = new Node("B");
		Node node2 = new Node("C");
		node1.addChindred(node2);
		tree.node.addChindred(node1);
	}
}
