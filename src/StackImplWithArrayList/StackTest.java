package StackImplWithArrayList;

public class StackTest {
	
	public static void main(String[] args) {
		
		// Create a queue of capacity 4 
        StackImpl q = new StackImpl(); 
  
        // print Queue elements
        q.displayQueue(); 
  
        // inserting elements in the queue 
        q.push(20); 
        q.push(30); 
        q.push(40);
        q.push(50);
        q.push(60);
  
        // print Queue elements 
        q.displayQueue(); 
		
		q.pull();
		System.out.print("\nAfter pull");
		q.displayQueue();

	}

}
