/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class MyList {

    Node head, tail;

    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    void add(int x) {
        if (isEmpty()) {
            head = tail = new Node(x, null);
        } else {
            Node q = new Node(x, null);
            tail.next = q;
            tail = q;
        }
    }

    //  1. 
    void addToHead(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        q.next = head;
        head = q;
    }

    //  2.
    void addToTail(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;

    }

    // 3.
    void addAfter(Node p, int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        q.next = p.next;
        p.next = q;
    }

    // 4.
    void traverse() {
        Node q = head;
        while (q != null) {
            System.out.print(q.info + " ");
            q = q.next;
        }
        System.out.println();
    }

    // 5.
    int deleteFromHead() {
        int data = 0;
        Node q = head;
        data = q.info;
        head = head.next;
        return data;
    }

    // 6.
    int deleteFromTail() {
        int data = 0;
        Node q = head;
        while (q.next.next != null) {
            q = q.next;
            data = q.info;
        }
        q.next = null;
        return data;
    }

    // 7.
    int deleteAfter(Node p) {
        int data = 0;
        Node q = head;
        while (q != null) {
            if (q.next == p.next) {
                data = p.next.info;
                q.next = q.next.next;
            }
            q = q.next;
        }
        return data;
    }

    // 8.
    void deleteValue(int x) {
        Node q = head.next;
        while (head != null) {
            if (q.info == x) {
                head.next = q.next;
                break;
            }
            head = head.next;
            q = q.next;
        }
    }

    // 9.
    Node search(int x) {
        Node p = head;
        while (p != null && p.info != x) {
            p = p.next;
        }
        return p;
    }

    // 10.
    int count() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    // 11.
    void deletePosition(int i) {
        int k = 0;
        Node p = head;
        while (p != null) {
            if (k == i) {
                dele(p);
                break;
            }
            p = p.next;
            k++;
        }

    }

    // 12.
    void sort() {
        Node pi, pj;
        int t;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info < pi.info) {
                    t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }

    // 13.
    void dele(Node p) {
        Node temp = head;
        while (temp != null) {
            if (temp.next == p) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    // 14.
    int[] toArray(MyList q) {
        int[] a = new int[q.count()];
        int i = 0;
        Node p = head;
        while (p != null) {
            a[i++] = p.info;
            p = p.next;
        }
        return a;

    }

    // 15.
    void merge(MyList q) {
        Node p_curr = head, q_curr = q.head;
        Node p_next, q_next;
        while (p_curr != null && q_curr != null) {
            p_next = p_curr.next;
            q_next = q_curr.next;
            q_curr.next = p_next;
            p_curr.next = q_curr;
            p_curr = p_next;
            q_curr = q_next;
        }
        q.head = q_curr;
    }

    // 16.
    void addBefore(Node p, int x) {
        Node q = new Node(x);
        Node temp = head;
        while (temp != null) {
            if (temp.next == p) {
                q.next = temp.next;
                temp.next = q;
                return;
            }
            temp = temp.next;
        }
    }

    // 17.
    public void add(MyList list) {
        this.tail.next = list.head;
        this.tail = list.tail;
    }

    // 18.
    int max() {
        Node current = head;
        if (current == null) {
            return 0;
        }
        int max = head.info;
        while (current != null) {
            if (current.info > max) {
                max = current.info;

            }
            current = current.next;
        }
        return max;
    }

    // 19.
    int min() {
        Node current = head;
        if (current == null) {
            return 0;
        }
        int min = head.info;
        while (current != null) {
            if (current.info < min) {
                min = current.info;

            }
            current = current.next;
        }
        return min;
    }

    // 20.
    int sum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.info;
            current = current.next;
        }
        return sum;
    }

    // 21.
    int avg() {
        Node current = head;
        int avg;
        int sum = 0;
        int length = 0;
        while (current != null) {
            sum += current.info;
            length++;
            current = current.next;
        }
        avg = sum / length;
        return avg;
    }

    // 22.
    boolean isSorted(Node head) {
        if (head == null) {
            return true;
        }

        for (Node t = head; t.next != null; t = t.next) {
            if (t.info <= t.next.info) {
                return false;
            }
        }
        return true;
    }

    // 23.
    void sortedInsert(Node p) {
        Node q;
        if (head == null || head.info >= p.info) {
            p.next = head;
            head = p;
        } else {
            q = head;
            while (q.next != null && q.next.info < p.info) {
                q = q.next;
            }
            p.next = q.next;
            q.next = p;
        }
    }

    // 24.
    public void reverse() {
        Node pointer = head;
        Node previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
            head = current;
        }

    }

    // 25.
    boolean areIdentical(MyList listb) {
        Node a = this.head, b = listb.head;
        while (a != null && b != null) {
            if (a.info != b.info) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }
}
