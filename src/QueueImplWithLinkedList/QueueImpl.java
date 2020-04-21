package QueueImplWithLinkedList;

public class QueueImpl {
	
	public static int front=-1, rear = -1;
	public static Object[] queue;
	
	QueueImpl(int capacity){
        queue = new Object[capacity]; 
	}
	
	public static boolean isEmptyList(){
		if(rear ==-1)
			return true;
		return false;
	}
	
	public static boolean isFull(){
		if (rear==queue.length-1)
			return true;
		return false;
	}
	
	// function to insert an element 
    // at the rear of the queue
	public static boolean push(Object data){
		if (isFull()) {
			return false;
		}
		else if(isEmptyList()){
			front = 0;
		}
		rear++;
		queue[rear] = data;
		return true;
	}
	
	// function to delete an element 
    // from the front of the queue 
	public static void pull(){
		
		if(isEmptyList()){
			return;
		}
		else if(front==0 && rear==0){
			front--;
		}
		else{
			for (int i = 0; i <= rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
		}
		 // store 0 at rear indicating there's no element 
        queue[rear] = 0; 

        // decrement rear 
        rear--;
		
	}
	
	public void displayQueue(){
		
		int i; 
		System.out.println();
        if (isEmptyList()) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i <= rear; i++) { 
            System.out.printf("Queue is: %d <-- ", queue[i]); 
        } 
	}
	
}
