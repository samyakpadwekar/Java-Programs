package Assgn4;

public class Queue1 {
	    int front, rear, size; 
	    int capacity; 
	    int array[]=null; 
	  
	    public Queue1(int capacity) 
	    { 
	        this.capacity = capacity; 
	        front = this.size = 0; 
	        rear = capacity - 1; 
	        array = new int[this.capacity]; 
	    } 
	  
	    
	    boolean isFull() 
	    { 
	        return (this.size == this.capacity); 
	    } 
	  
	    
	    boolean isEmpty() 
	    { 
	        return (this.size == 0); 
	    } 
	  
	    
	    void enqueue(int item) 
	    { 
	        if (isFull()) 
	            return; 
	        this.rear = (this.rear + 1) % this.capacity; 
	        this.array[this.rear] = item; 
	        this.size = this.size + 1; 
	        System.out.println(item + " enqueued to queue"); 
	    } 
	  
	    int dequeue() 
	    { 
	        if (isEmpty())
	            return Integer.MIN_VALUE; 
	  
	        int item = this.array[this.front]; 
	        this.front = (this.front + 1) % this.capacity; 
	        this.size = this.size - 1; 
	        return item; 
	    } 
	  
	    
	    int front() 
	    { 
	        if (isEmpty()) 
	            return Integer.MIN_VALUE; 
	  
	        return this.array[this.front]; 
	    } 
	  
	 
	    int rear() 
	    { 
	        if (isEmpty()) 
	            return Integer.MIN_VALUE; 
	  
	        return this.array[this.rear]; 
	    } 
	} 
	  
	


