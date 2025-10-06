/*
 * Q1.Implement a Queue data structure using an array. 
Support the operations: 
 enqueue(x) – insert an element 
 dequeue() – remove an element 
 display() – print queue elements 
Input Example: 
enqueue 1 
enqueue 2 
dequeue 
enqueue 3 
display 
Output Example: 
Dequeued: 1 
Queue: 2 3
 */

import java.util.Scanner;

class Queue {

    private int arr[];
    private int front, rear, size, capacity;

    public Queue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int newEle)
    {
        if(size == capacity)
        {
            System.out.println("Queue is Full");
            return;
        }

        if(rear == -1)
        {
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear + 1) % capacity;
        }
        arr[rear] = newEle;
        System.out.println("The element pushed is "+newEle);
        size++;
    }

    public void dequeue(){
        if(front == -1)
        {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped = arr[front];
        if (size == 1) {
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1)%capacity;
        }
        System.out.println("Dequeued: "+popped);
        size--;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for(int i = 0; i < size; i++)
        {
            int ind = (front + i)%capacity;
            System.out.print(arr[ind] + " ");
        }
        System.out.println();
    }

    
 }
 public class day4_prob1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(16);

        while(sc.hasNext()){
            String cmd = sc.next();
            if(cmd.equals("enqueue"))
            {
                int x = sc.nextInt();
                q.enqueue(x);
            }
            else if(cmd.equals("dequeue"))
            {
                q.dequeue();
            }
            else if (cmd.equals("display"))
            {
                q.display();
            }
            else{
                break;
            }
        }
    }
}
