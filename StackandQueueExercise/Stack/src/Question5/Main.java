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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        StackObject s =new StackObject();
        System.out.println("1. Test stack");
        s.push("one");
        s.push(1);
        s.push("two");
        s.push(2);
        System.out.println("Peek: " + s.peek() + " ");
        s.peek();
        System.out.print("Stack after peek: ");
        s.traveser();
        
        QueueObject s1 = new QueueObject();
        System.out.println("\n2. Test queue");
        s1.enqueue("one");
        s1.enqueue(1);
        s1.enqueue("two");
        s1.enqueue(2);
        System.out.print("Queue: ");
        s1.traveser();
        System.out.print("\nDequeue: "+s1.dequeue()+" ");
        System.out.print("\nQueue after dequeue: ");
        s1.traveser();
        System.out.println("\nFront: "+s1.front()+" ");
        System.out.print("Queue after front: ");
        s1.traveser();
        System.out.println();
    }
    
}
