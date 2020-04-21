package QueueImplWithLinkedList;

public class QueueTest {
	
	public static void main(String[] args) {
		
		// Create a queue of capacity 4 
        QueueImpl q = new QueueImpl(); 
  
        // inserting elements in the queue 
        q.push(20);
        q.push(30); 
        q.push(40); 
        q.push(50);
        
        
        System.out.println("QueueFront: "+q.front);
        System.out.println("QueueRear: "+q.rear);
        
        q.pull();
        q.pull();
        q.pull();
        q.pull();
        q.pull();
        
        System.out.println("After pull");
        System.out.println("QueueFront: "+q.front);
        System.out.println("QueueRear: "+q.rear);

	}

}
