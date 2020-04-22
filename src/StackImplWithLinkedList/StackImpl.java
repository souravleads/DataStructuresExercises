package StackImplWithLinkedList;

import java.util.LinkedList;
import java.util.List;

import QueueImplWithLinkedList.Node;

public class StackImpl {
	
	Node front;
	
	StackImpl(){
        this.front = null;
	}
	
	public boolean isEmptyList(){
		if(this.front == null){
			return true;
		}
			
		return false;
	}
	
	// function to insert an element 
    // at the rear of the queue
	public boolean push(Object data){
		
		// Create a new LinkedList node
		Node temp = new Node(data);
		
		if (!isEmptyList()) {
			temp.next = this.front;
		}
		this.front = temp;
		return true;
	}
	
	// function to delete an element 
    // from the front of the queue 
	public void pull(){
		
		if(isEmptyList()){
			return;
		}
		this.front = this.front.next;
	}
	
	public Object peek(){
		
		if (isEmptyList()) { 
            return null; 
        }
		return this.front.key;
		
	}
	
	public void displayQueue(){
		
		System.out.println();
        if (isEmptyList()) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.println("Stack are: "+this.front.toString());
	}
	
}
