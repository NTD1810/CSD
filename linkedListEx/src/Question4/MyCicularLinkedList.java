/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class MyCicularLinkedList {

    Node head, tail;

    MyCicularLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    // 1.
    void addToHead(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        q.next = head;
        head = q;
        tail.next = q;

    }

    // 2.
    void addToTail(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
        tail.next = head;
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
        if (head != null) {
            do {
                System.out.print(q.info + " ");
                q = q.next;
            } while (q != head);
        }
        System.out.println();
    }

    // 5.
    void deleteFromHead() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                head = head.next;
                tail.next = head;
            } else {
                head = tail = null;
            }
        }
    }

    // 6.
    void deleteFromTail() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                Node q = head;
                while (q.next != tail) {
                    q = q.next;
                }
                tail = q;
                tail.next = head;
            } else {
                head = tail = null;
            }
        }
    }

    // 7.
    Node deleteAfter(Node head) {
        if (head == null) {
            return null;
        }
        Node q = head, p = new Node();
        if (q.next == head) {
            head = null;
            return head;
        }
        if (q == head) {
            p = head;
            while (p.next != head) {
                p = p.next;
            }
            head = q.next;
            p.next = head;
        } 
        else if (q.next == head) {
            p.next = head;
        } else {
            p.next = q.next;
        }
        return head;
    }

    // 8.
    void deleteValue(int x) {
        Node q = head.next;
        while (head != null) {
            if (q.info == x) {
                head.next = q.next;
                //q.next.prev=q.prev;
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
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                if (q.info == x) {
                    flag = true;
                    break;
                }
                q = q.next;
                i++;
            } while (q != head);
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
        if (head != null) {
            while (q.next != head) {
                length++;
                q = q.next;
            }
            length++;
        }

        return length;
    }

}
