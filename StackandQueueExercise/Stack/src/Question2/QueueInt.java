/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class QueueInt {
    protected int[] a;
    protected int max;
    protected int first, last;

    public QueueInt() {
        this(10);
    }

    public QueueInt(int max1) {
        max = max1;
        a = new int[max];
        first = last = -1;
    }

    public boolean isFull() {
        return ((first == 0
                && last == max - 1) || first == last + 1);
    }

    private boolean grow() {
        int i, j;
        int max1 = max + max / 2;
        int[] a1 = new int[max1];
        if (a1 == null) {
            return (false);
        }
        if (last >= first) {
            for (i = first; i <= last; i++) {
                a1[i - first] = a[i];
            }
        } else {
            for (i = first; i < max; i++) {
                a1[i - first] = a[i];
            }
            i = max - first;
            for (j = 0; j <= last; j++) {
                a1[i + j] = a[j];
            }
        }
        a = a1;
        first = 0;
        last = max - 1;
        max = max1;
        return (true);
    }

    // 1.
    public boolean isEmpty() {
        return (first == -1);
    }

    // 2.
    public void clear(){
        first=last=-1;
    }
    
    // 3.
    void enqueue(int x) {
        if (isFull() && !grow()) {
            return;
        }
        if (last == max - 1 || last == -1) {
            a[0] = x;
            last = 0;
            if (first == -1) {
                first = 0;
            }
        } else {
            a[++last] = x;
        }
    }
    
    // 4.
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        int x = a[first];
        if (first == last) // only one element
        {
            first = last = -1;
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return (x);
    }

    // 5.
    int front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (a[first]);
    }

    // 6.
    void traveser() {
        if (isEmpty()) {
            System.out.println("Queue is empty\n");
            return;
        }
        for(int i=first; i<= last; i++){
            System.out.print(a[i]);
        }
    }
    
    void reveser() {
        if (isEmpty()) {
            System.out.println("Queue is empty\n");
            return;
        }
        System.out.print("Decimal -->  Binary: ");
        for(int i=last; i>=first; i--){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
