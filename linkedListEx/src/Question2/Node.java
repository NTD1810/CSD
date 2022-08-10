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
public class Node {
    String data;
    Node next;

    Node() {
    }

    Node(String s, Node p) {
        data = s;
        next = p;
    }
    
    Node(String s){
        data = s;
        next = null;
    }
}
