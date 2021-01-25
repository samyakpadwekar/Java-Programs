package Assgn4;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) 
    { 
        Queue1 queue = new Queue1(1000); 
  
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
  
        System.out.println(queue.dequeue() +" dequeued from queue\n"); 
  
        System.out.println("Front item is "+ queue.front()); 
  
        System.out.println("Rear item is "+ queue.rear()); 
    } 
} 