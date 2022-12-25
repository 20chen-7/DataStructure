package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;
    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }
    public void push(Employee employee){
        if (top == stack.length){
            //resize the backing array time complexity is O(n);
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }
    public Employee pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top]; //based on the n+1, top = 5, remove the 4th(0's)
        stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top==0;
    }

    public void printStack(){
        for (int i = top - 1; i >= 0; i-- ){
            System.out.println(stack[i]);
        }
    }
}
