/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Node {
    int value;
    Node left;
    Node right;
    Node root;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        root = left = right = null;
    }
}
