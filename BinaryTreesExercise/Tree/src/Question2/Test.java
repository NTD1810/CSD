/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BST tree = new BST();
        tree.insert("H");
        tree.insert("B");
        tree.insert("D");
        tree.insert("S");
        tree.insert("Q");
        tree.insert("L");
        tree.insert("N");
        
        System.out.print("Inorder traversal: ");
        tree.inorder();
        System.out.println();
        
        System.out.print("Preorder traversal: ");
        tree.preorder();
        System.out.println();
        
        System.out.print("Postorder traversal: ");
        tree.postorder();
        System.out.println();
        
        System.out.print("Breadth traversal: ");
        tree.breadth();
        System.out.println();
        
        System.out.print("Find node: ");
        if(tree.search("Q")==null){
            System.out.println("Not found");
        }
        else System.out.println("Node is present");        
        
        System.out.println("Count node: "+tree.count(tree.root));
        System.out.println("level: "+tree.calculateTreeHeight(tree.root));
        
        tree.dele("S");
        tree.dele("T");
        tree.dele("P");
        System.out.print("List after delete: ");
        tree.inorder();
        System.out.println();
        
        Node min = tree.min(tree.root);
        Node max = tree.max(tree.root);
        System.out.println("min: "+ min.value);
        System.out.println("max: "+ max.value);

        
        System.out.print("Test AVL: ");
        if(tree.checkAVL()){
            System.out.println("binary tree is a AVL");
        }
        else System.out.println("binary tree is not a AVL");
        
        
        System.out.print("Test heap: ");
        if (tree.isHeap(tree.root) == true) {
            System.out.println("Given binary tree is a Heap");
        } else {
            System.out.println("Given binary tree is not a Heap");
        }

    }    
    
    
}
