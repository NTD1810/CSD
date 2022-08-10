/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.EmptyStackException;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class StackChar {
    protected char[] a;
    int top, max;

    public StackChar() {
        this(50);
    }

    public StackChar(int max1) {
        max = max1;
        a = new char[max];
        top = -1;
    }

    protected boolean grow() {
        int max1 = max + max / 2;
        char[] a1 = new char[max1];
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
    public void push(char c) {
        if (isFull() && !grow()) {
            return;
        }
        a[++top] = c;
    }

    // 4.
    public char pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }   
        char c =a[top];
        top--;
        return (c);
    }
    
    // 5.
    char peek() throws EmptyStackException {
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
        while(!isEmpty()){
            System.out.print(pop()+" ");
        }
        System.out.println();
    }
}
