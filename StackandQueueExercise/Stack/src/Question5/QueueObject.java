/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class QueueObject {

    protected Object[] a;
    protected int max;
    protected int first, last;

    public QueueObject() {
        this(10);
    }

    public QueueObject(int max1) {
        max = max1;
        a = new Object[max];
        first = last = -1;
    }

    public boolean isFull() {
        return ((first == 0
                && last == max - 1) || first == last + 1);
    }

    private boolean grow() {
        int i, j;
        int max1 = max + max / 2;
        Object[] a1 = new Object[max1];
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
    void enqueue(Object ob) {
        if (isFull() && !grow()) {
            return;
        }
        if (last == max - 1 || last == -1) {
            a[0] = ob;
            last = 0;
            if (first == -1) {
                first = 0;
            }
        } else {
            a[++last] = ob;
        }
    }
    
    // 4.
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object ob = a[first];
        if (first == last) // only one element
        {
            first = last = -1;
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return (ob);
    }

    // 5.
    Object front() throws Exception {
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
            System.out.print(a[i]+" ");
        }
    }
}
