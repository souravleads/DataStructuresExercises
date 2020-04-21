package QueueImplWithLinkedList;

public class QueueTest {
	
	public static void main(String[] args) {
		
		// Create a queue of capacity 4 
        QueueImpl q = new QueueImpl(4); 
  
        // print Queue elements 
        q.displayQueue(); 
  
        // inserting elements in the queue 
        q.push(20); 
        /*q.push(30); 
        q.push(40); 
        q.push(50);
        q.push(60);*/
  
        // print Queue elements 
        q.displayQueue(); 
		
		q.pull();
		q.displayQueue();

	}

}
