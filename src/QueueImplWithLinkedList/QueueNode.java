package QueueImplWithLinkedList;

//A linked list (LL) node to store a queue entry 
public class QueueNode {
	
	Object key;
	QueueNode next;
	
	// constructor to create a new linked list node 
	public QueueNode(Object key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "QueueNode [key=" + key + ", next=" + next + "]";
	}

}
