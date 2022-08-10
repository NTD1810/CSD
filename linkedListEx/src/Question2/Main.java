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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToTail("apple");
        list.addToTail("key");
        
        list.addToHead("water");
        list.addToHead("pen");   
        System.out.print("List: ");
        list.traverse();
        System.out.println("Size of list: " + list.count());
        
        System.out.print("\nList after addNode: ");
        list.addAfter(list.head, "book");
        list.traverse();
        
        System.out.print("\nList after deleteNode: ");
        list.deleteAfter(list.head.next);
        list.traverse();
        
        System.out.print("\nList after deleteFirst: ");
        list.deleteFromHead();
        list.traverse();
        
        System.out.print("\nList after deleteLast: ");
        list.deleteFromTail();
        list.traverse();
        
        System.out.print("\nList after deleteValue: ");
        list.deleteValue("apple");
        list.traverse();
        
        System.out.println("\nSearch");
        list.search("apple");
    }
    
}
