/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        Node x;

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n = ");
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i=0; i<n; i++){
//            list.add(Integer.parseInt(sc.nextLine()));
//        }
//        System.out.print("My List: ");
//        list.traverse();
//        System.out.println();
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(9);
        System.out.print("List: ");
        list.traverse();
        System.out.println("Size of list: " + list.count());
        System.out.print("List after sort: ");
        list.sort();

        System.out.println("\n1. Test addFirst");
        list.addToHead(19);
        System.out.print("List after add: ");
        list.traverse();

        System.out.println("\n2. Test addLast");
        list.addToTail(25);
        System.out.print("List after add: ");
        list.traverse();

        System.out.println("\n3. Test addAfterNode");
        int k = sc.nextInt();
        x = list.search(k);
//        x=new Node(k);
        list.addAfter(x, 6);
        System.out.print("List after add: ");
        list.traverse();

        System.out.println("max: " + list.max());
        System.out.println("min: " + list.min());
        System.out.println("sum: " + list.sum());
        System.out.println("avg: " + list.avg());

        System.out.println("\n4. Test deleteFirst");
        list.deleteFromHead();
        System.out.print("List after delete: ");
        list.traverse();

        System.out.println("\n5. Test deleteLast");
        list.deleteFromTail();
        System.out.print("List after delete: ");
        list.traverse();

        System.out.println("\n6. Test deleteAfterNode");
        int k1 = sc.nextInt();
        Node x1 = list.search(k1);
        list.deleteAfter(x1);
        System.out.print("List after delete: ");
        list.traverse();

        System.out.println("\n7. Test deleteValue");
        list.deleteValue(5);
        System.out.print("List after delete: ");
        list.traverse();

        System.out.println("\n8. Test Search");
        if (list.search(6) == null) {
            System.out.println("Node is not present");
        } else {
            System.out.println("Node is present");
        }

        System.out.println("\n9. Test deletePosition");
        list.deletePosition(2);
        System.out.print("List after delete: ");
        list.traverse();

        System.out.println("\n10. Test addBeforeNode");
        list.addBefore(list.head.next, 3);
        System.out.print("List after add: ");
        list.traverse();

        MyList list1 = new MyList();
        list1.add(7);
        list1.add(2);
        list1.add(5);
        System.out.print("\nList1: ");
        list1.traverse();

        System.out.println("\n11. Test Merge");
        list1.merge(list);
        list1.sort();
        System.out.print("List1 after merge: ");
        list1.traverse();

        System.out.println("\n12. Test addNewList");
        MyList list2 = new MyList();
        list2.add(12);
        list2.add(13);
        list2.add(list1);
        System.out.print("List after add: ");
        list2.traverse();

        System.out.println("\n13. Check the list1 is sorted");
        System.out.print("List2: ");
        list2.traverse();
        if (list1.isSorted(list1.head)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("\n14. Check two singly linked list have the same contents");
        System.out.print("List2: ");
        list2.traverse();
        System.out.print("List1: ");
        list1.traverse();
        if (list2.areIdentical(list1) == true) {
            System.out.println("Identical ");
        } else {
            System.out.println("Not identical ");
        }

    }

}
