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
    public static void main(String[] args) throws Exception {
        StackChar s =new StackChar();
        System.out.println("1. Test stack");
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        System.out.println("Peek: " + s.peek() + " ");
        s.peek();
        System.out.print("Stack after peek: ");
        s.traveser();
        
        QueueChar s1 = new QueueChar();
        System.out.println("\n2. Test queue");
        s1.enqueue('a');
        s1.enqueue('b');
        s1.enqueue('c');
        s1.enqueue('d');
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
