package StackImplWithArray;

import java.util.Arrays;

public class StackImpl {
	
	int peek=-1;
	Object[] stack;
	
	StackImpl(int capacity){
        stack = new Object[capacity]; 
	}
	
	public boolean isEmptyList(){
		if(peek ==-1)
			return true;
		return false;
	}
	
	public boolean isFull(){
		if (peek >= stack.length)
			return true;
		return false;
	}
	
	// function to insert an element 
    // at the rear of the queue
	public boolean push(Object data){
		peek++;
		if (isFull()) {
			return false;
		}
		
		stack[peek] = data;
		return true;
	}
	
	// function to delete an element 
    // from the front of the queue 
	public void pull(){
		
		if(isEmptyList()){
			return;
		}
		stack[peek] = null;
		/*else if(peek == 0){
			stack[peek] = 0; 
		}
		else{
			for (int i = 0; i < stack.length-1; i++) { 
				stack[i] = stack[i + 1]; 
            }
			stack[stack.length-1] = null;  // Or we can insert 0 or copy into an array which has length is less then 1
  
		}*/
        peek--;
		
	}
	
	public void displayQueue(){
		
		int i; 
		System.out.println();
        if (isEmptyList()) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        
        System.out.println("Stack are: "+Arrays.toString(stack));
        
        //OR
        
        // traverse front to rear and print elements 
        /*for (i = 0; i < stack.length; i++) { 
            System.out.printf("Stack is: %d <-- ", stack[i]); 
        }*/
	}
	
}
