package QueueImplWithLinkedList;

//A class to represent a queue 
//The queue, front stores the front node of LinkList 
//and rear stores the last node of LinkedList 
public class QueueImpl {
	
	Node front, rear;
	
	QueueImpl(){
		
        this.front = this.rear = null; 
	}
	
	public boolean isQueueEmpty(){
		if(this.rear == null)
			return true;
		return false;
	}
	
	
	// function to insert an element 
    // at the rear of the queue
	public void push(Object data){
		
		// Create a new LinkedList node 
		Node temp = new Node(data);
		
		// If queue is empty, then new node is front and rear both
		if(isQueueEmpty())
			this.front = temp;
		else
			this.rear.next = temp;
		this.rear = temp;
	}
	
	public void pull(){
		
		//check if linked list is empty then return
		if (isQueueEmpty())
			return;
		else if(this.front.next == null)
			this.front = this.rear = null;
		else{
			// put next node of front as a key of front 
			this.front.key = this.front.next.key;
			this.front.next = this.front.next.next;
		}

	}
	
}
