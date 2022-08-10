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
public class MyLinkedList {

    Node head, tail;

    MyLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    // 1.
    void addToHead(String s) {
        Node q = new Node(s);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        q.next = head;
        head = q;
    }

    // 2.
    void addToTail(String s) {
        Node q = new Node(s);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    // 3.
    void addAfter(Node p, String s) {
        Node q = new Node(s);
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
            System.out.print(q.data + " ");
            q = q.next;
        }
        System.out.println();
    }

    // 5.
    String deleteFromHead() {
        String data = null;
        Node q = head;
        data = q.data;
        head = head.next;
        return data;
    }

    // 6.
    String deleteFromTail() {
        String data = null;
        Node q = head;
        while (q.next.next != null) {
            q = q.next;
            data = q.data;
        }
        q.next = null;
        return data;
    }

    // 7.
    String deleteAfter(Node p) {
        String data = null;
        Node q = head;
        while (q != null) {
            if (q.next == p.next) {
                data = p.next.data;
                q.next = q.next.next;
            }
            q = q.next;
        }
        return data;
    }

    // 8.
    void deleteValue(String s) {
        Node q = head.next;
        while (head != null) {
            if (q.data.equals(s)) {
                head.next = q.next;
                break;
            }
            head = head.next;
            q = q.next;
        }
    }

    // 9.
    void search(String s) {
        int i = 1;
        boolean flag = false;
        Node q = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (q != null) {
            if (q.data.equals(s)) {
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
