/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.EmptyStackException;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class StackString {
    protected String [] a;
    int top, max;

    public StackString() {
        this(50);
    }

    public StackString(int max1) {
        max = max1;
        a = new String[max];
        top = -1;
    }

    protected boolean grow() {
        int max1 = max + max / 2;
        String[] a1 = new String[max1];
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
    public void push(String s) {
        if (isFull() && !grow()) {
            return;
        }
        a[++top] = s;
    }

    // 4.
    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } 
        String s =a[top];
        top--;
        return (s);
    }
    
    // 5.
    String peek() throws EmptyStackException {
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
