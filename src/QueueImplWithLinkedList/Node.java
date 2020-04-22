package QueueImplWithLinkedList;

//A linked list (LL) node to store a queue entry 
public class Node {
	
	public Object key;
	public Node next;
	
	// constructor to create a new linked list node 
	public Node(Object key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}

}
