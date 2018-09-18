package com.design.composite;

import java.util.Enumeration;
import java.util.Vector;

public class Node {
   private String name;
   private Node parent;
   Vector<Node> childred = new Vector<>();
   public Node(String name) {
	   this.name=name;
   }
public Node getParent() {
	return parent;
}
public void setParent(Node parent) {
	this.parent = parent;
}

   public void addChindred(Node node) {
	   childred.add(node);
   }
   
   public void delete(Node node) {
	   childred.remove(node);
   }
   public Enumeration<Node> getChildred(){
	   return childred.elements();
   }
}
