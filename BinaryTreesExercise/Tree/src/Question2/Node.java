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
    String value;
    Node left;
    Node right;
    Node root;

    public Node() {
    }

    public Node(String value) {
        this.value = value;
        root = left = right = null;
    }
}
