/*
 * Implement a stack data structure using an array. Support push, pop, and peek.
 Input (sequence of operations):
 push 10  
push 20  
peek  
pop  
pop  
pop  
Output:
 20
 20
 10
 Stack Underflow
 */

import java.util.Scanner;

public class day3_prob4 {

    static class Stack {
        int arr[];
        int top;
        int capacity;

        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println(arr[top--]);
        }

        public void peek() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println(arr[top]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(100); // fixed capacity

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.equals("")) break; // stop on empty line

            if (line.startsWith("push")) {
                int val = Integer.parseInt(line.split(" ")[1]);
                st.push(val);
            }
            else if (line.equals("pop")) {
                st.pop();
            }
            else if (line.equals("peek")) {
                st.peek();
            }
            else {
                System.out.println("Invalid Operation");
            }
        }
    }
}