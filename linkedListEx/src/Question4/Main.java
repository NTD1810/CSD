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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyCicularLinkedList list = new MyCicularLinkedList();
        list.addToTail(3);
        list.addToHead(6);
        list.addToTail(2);
        list.addToHead(4);
        list.addToTail(9);
        list.addToTail(0);
        System.out.print("List: ");
        list.traverse();
        System.out.println("Size of list: " + list.count());       
        
        System.out.print("\nList after deleteFirst: ");
        list.deleteFromHead();
        list.traverse();
        
        System.out.print("\nList after deleteLast: ");
        list.deleteFromTail();
        list.traverse();
        
        System.out.println("\nSearch");
        list.search(2);
        
        System.out.print("\nList after addNode: ");
        list.addAfter(list.head.next, 11);
        list.traverse();
        
        System.out.print("\nList after deleteValue: ");
        list.deleteValue(11);
        list.traverse();
        
        System.out.print("\nList after deleteNode: ");
        list.deleteAfter(list.head.next);
        list.traverse();        
    }
    
}
