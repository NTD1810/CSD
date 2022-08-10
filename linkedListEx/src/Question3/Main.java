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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();

        list.addToTail(2);
        list.addToTail(6);
        
        list.addToHead(0);
        list.addToHead(5);
        list.addToHead(45);
        list.addToHead(20);
        System.out.print("List: ");
        list.print();
        System.out.println("Size of list: " + list.count());
        
        System.out.print("\nList after addNode: ");
        list.addAfter(list.head, 9);
        list.print();
        
        System.out.print("\nList after deleteNode: ");
        list.deleteNode(list.head.next);
        list.print();
        
        System.out.print("\nList after deleteFirst: ");
        list.deleteFromHead();
        list.print();
        
        System.out.print("\nList after deleteLast: ");
        list.deleteFromTail();
        list.print();
        
        System.out.print("\nList after deleteValue: ");
        list.deleteValue(5);
        list.print();
        
        System.out.println("\nPrint DoublyLinkedList");
        list.traverse();
        
        System.out.println("\nSearch");
        list.search(2);
    }

}
