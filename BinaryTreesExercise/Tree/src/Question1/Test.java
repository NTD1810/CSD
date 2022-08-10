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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BST tree = new BST();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        
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
        if(tree.search(2)==null){
            System.out.println("Not found");
        }
        else System.out.println("Node is present");
        
        System.out.println("Count node: "+tree.count(tree.root));
        System.out.println("level: "+tree.calculateTreeHeight(tree.root));
        
        tree.dele(2);
        tree.dele(3);
        tree.dele(11);
        System.out.print("List after delete: ");
        tree.inorder();
        System.out.println();
        
        Node min = tree.min(tree.root);
        Node max = tree.max(tree.root);
        System.out.println("min: "+ min.value);
        System.out.println("max: "+ max.value);
        System.out.println("sum: "+tree.sum(tree.root));
        System.out.println("avg: "+ tree.avg(tree.root));
        
        int maxPath=tree.getRootToLeafSum(tree.root);
        System.out.println("Find expensive path: "+ maxPath);
        
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
