package StackImplWithLinkedList;

public class StackTest {
	
	public static void main(String[] args) {
		
		// Create a queue of capacity 4 
        StackImpl q = new StackImpl(); 
  
        // print Queue elements
        q.displayQueue(); 
  
        // inserting elements in the queue 
        q.push("H"); 
        q.push("E"); 
        q.push("L");
        q.push("L");
        q.push("O");
  
        // print Queue elements 
        q.displayQueue(); 
        System.out.println("Peek Element: "+q.peek());
        
		q.pull();
		q.pull();
		System.out.print("\nAfter pull");
		q.displayQueue();
		
		System.out.println("Peek Element: "+q.peek());

	}

}
