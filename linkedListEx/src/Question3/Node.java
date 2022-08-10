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
public class Node {
    int info;
    Node prev;
    Node next;

    Node() {
    }

    Node(int x, Node p, Node q) {
        info = x;
        prev = q;
        next = p;
    }
    
    Node(int x){
        info = x;
        prev=next = null;
    }
}
