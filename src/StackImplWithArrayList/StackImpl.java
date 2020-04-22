package StackImplWithArrayList;

import java.util.ArrayList;
import java.util.List;

public class StackImpl {
	
	List<Object> stack;
	
	StackImpl(){
        stack = new ArrayList<Object>(); 
	}
	
	public boolean isEmptyList(){
		if(stack.size()==0)
			return true;
		return false;
	}
	
	// function to insert an element 
    // at the rear of the queue
	public boolean push(Object data){
		
		stack.add(data);
		return true;
	}
	
	// function to delete an element 
    // from the front of the queue 
	public void pull(){
		
		if(isEmptyList()){
			return;
		}
		stack.remove(stack.size()-1);
	}
	
	public void displayQueue(){
		
		System.out.println();
        if (isEmptyList()) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.println("Stack are: "+stack.toString());
	}
	
}
