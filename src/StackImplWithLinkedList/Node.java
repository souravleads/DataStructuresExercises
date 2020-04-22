package StackImplWithLinkedList;

public class Node {
	
	Object key;
	Node next;
	
	public Node(Object key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}
	
}
