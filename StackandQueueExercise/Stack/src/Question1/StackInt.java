/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.EmptyStackException;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class StackInt {
    protected int [] a;
    int top, max;

    public StackInt() {
        this(50);
    }

    public StackInt(int max1) {
        max = max1;
        a = new int[max];
        top = -1;
    }

    protected boolean grow() {
        int max1 = max + max / 2;
        int[] a1 = new int[max1];
        if (a1 == null) {
            return (false);
        }
        for (int i = 0; i <= top; i++) {
            a1[i] = a[i];
        }
        a = a1;
        return (true);
    }

    // 1.
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == max - 1);
    }

    // 2.
    public void clear() {
        top = -1;
    }

    // 3.
    public void push(int x) {
        if (isFull() && !grow()) {
            return;
        }
        a[++top] = x;
    }

    // 4.
    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }   
        int x =a[top];
        top--;
        return (x);
    }
    
    // 5.
    int peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (a[top]);
    }

    // 6.
    void traveser() {
        if (isEmpty()) {
            System.out.println("Stack is empty\n");
            return;
        }
        System.out.print("Decimal -->  Binary: ");
        while(!isEmpty()){
            System.out.print(pop()+" ");
        }
        System.out.println();
    }
}
