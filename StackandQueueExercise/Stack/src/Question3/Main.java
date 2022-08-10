/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        StackString s =new StackString();
        System.out.println("1. Test stack");
        s.push("one");
        s.push("two");
        s.push("three");
        s.push("four");
        System.out.println("Peek: " + s.peek() + " ");
        s.peek();
        System.out.print("Stack after peek: ");
        s.traveser();        
        
        QueueString s1 = new QueueString();
        System.out.println("\n2. Test queue");
        s1.enqueue("one");
        s1.enqueue("two");
        s1.enqueue("three");
        s1.enqueue("four");
        System.out.print("Queue: ");
        s1.traveser();
        System.out.print("Dequeue: "+s1.dequeue()+" ");
        System.out.print("\nQueue after dequeue: ");
        s1.traveser();
        System.out.println("Front: "+s1.front()+" ");
        System.out.print("Queue after front: ");
        s1.traveser();
    }
    
}
