/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class MyDoublyLinkedList {

    Node head, tail;

    MyDoublyLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    void print() {
        Node q = head;
        while (q != null) {
            System.out.print(q.info + " ");
            q = q.next;
        }
        System.out.println();
    }

    // 1.
    void addToHead(int x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        }
        Node new_Node = new Node(x);
        new_Node.next = head;
        new_Node.prev = null;
        head.prev = new_Node;
        head = new_Node;
    }

    // 2.
    void addToTail(int x) {
        if (isEmpty()) {
            head = tail = new Node(x);
            return;
        }
        Node q = new Node(x);
        q.next = null;
        q.prev = tail;
        tail.next = q;
        tail = q;
    }

    // 3.
    void addAfter(Node p, int x) {
        Node q = new Node(x);
        Node nodeAfter = p.next;
        q.next = nodeAfter;
        q.prev = p;
        nodeAfter.prev = q;
        p.next = q;
    }

    // 4.
    void traverse() {
        Node last = null;
        System.out.print("First -> Last: ");
        while (head != null) {
            System.out.print(head.info + " ");
            last = head;
            head = head.next;
        }
        System.out.println();
        System.out.print("Last -> First: ");
        while (last != null) {
            System.out.print(last.info + " ");
            last = last.prev;
        }
        System.out.println();
    }

    // 5.
    int deleteFromHead() {
        int data = 0;
        Node q = head.next;
        q.prev = null;
        head = q;
        return data;
    }

    // 6.
    int deleteFromTail() {
        int data = 0;
        Node q = tail.prev;
        q.next = null;
        tail = q;
        return data;
    }

    // 7.
    void deleteNode(Node p) {
        if (head == null || p == null) {
            return;
        }
        if (head == p) {
            head = p.next;
        }
        if (p.next != null) {
            p.next.prev = p.prev;
        }
        if (p.prev != null) {
            p.prev.next = p.next;
        }
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
    void search(int x) {
        int i = 1;
        boolean flag = false;
        Node q = head;
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
        while (q != null) {
            if (q.info == x) {
                flag = true;
                break;
            }
            q = q.next;
            i++;
        }
        if (flag) {
            System.out.println("Node is present");
        } else {
            System.out.println("Node is not present");
        }

    }

    // 10.
    int count() {
        int length = 0;
        Node q = head;
        while (q != null) {
            length++;
            q = q.next;
        }
        return length;
    }
}
