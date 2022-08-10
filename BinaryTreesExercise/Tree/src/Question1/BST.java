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
public class BST {

    Node root;

    BST() {
        root = null;
    }

    // 1.
    public boolean isEmpty() {
        return (root == null);
    }

    // 2.
    public void clear() {
        root = null;
    }

    // 3.
    public Node search(int x) {
        Node p = root;
        while (p.value != x) {
            if (p != null) {
                if (p.value > x) {
                    p = p.left;
                } else {
                    p = p.right;
                }
                if (p == null) {
                    return null;
                }
            }

        }
        return p;
    }

    // 4.
    void insert(int x) {
        root = insertRec(root, x);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.value) {
            root.left = insertRec(root.left, key);
        } else if (key > root.value) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // 5.
    public void breadth() {
        int height = calculateTreeHeight(root);
        for (int i = 0; i < height; i++) {
            breadthRec(root, i);
        }
    }

    public void breadthRec(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 0) {
            System.out.print(node.value + " ");
        } else {
            breadthRec(node.left, level - 1);
            breadthRec(node.right, level - 1);
        }
    }

    // 6.
    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorderRec(root.left);
        preorderRec(root.right);
    }

    // 7.
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // 8.
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {

            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    // 9.
    int count(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    // 10.
    void dele(int x) {
        root = deleteRec(root, x);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.value) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.value) {
            root.right = deleteRec(root.right, key);
        } 
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node p = min(root.right);
            root.value = p.value;
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }
    
    // 11.
    Node min(Node node) {
        if (node.left != null) {
            return min(node.left);
        }
        return node;
    }

    // 12.
    Node max(Node node) {
        if (node.right != null) {
            return max(node.right);
        }
        return node;
    }

    // 13.
    int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.value + sum(root.left) + sum(root.right);
    }
    
    // 14.
    int avg(Node root) {
        int avg;
        if (root == null) {
            return 0;
        }
        avg=sum(root)/count(root);
        return avg;
    }
    
    // 15.
    int calculateTreeHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int heightleft = calculateTreeHeight(root.left);
            int heightright = calculateTreeHeight(root.right);
            return Math.max(heightleft, heightright) + 1;
        }
    }

    // 16.
    public int getRootToLeafSum(Node root) {
        if (root == null) {
            return 0;
        }

        int left = getRootToLeafSum(root.left);

        int right = getRootToLeafSum(root.right);

        return (left > right ? left : right) + root.value;
    }
    
    // 17.
    private boolean checkAvl(Node root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(calculateTreeHeight(root.left) - calculateTreeHeight(root.right)) > 1) {
            return false;
        }
        return checkAvl(root.left) && checkAvl(root.right);
    }

    public boolean checkAVL() {
        return checkAvl(root);
    }
    // 18.
    // 19.
    boolean isCompleteUtil(Node root, int index, int number_nodes) {
        if (root == null) {
            return true;
        }
        if (index >= number_nodes) {
            return false;
        }
        return isCompleteUtil(root.left, 2 * index + 1, number_nodes)
                && isCompleteUtil(root.right, 2 * index + 2, number_nodes);
    }

    boolean isHeapUtil(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.right == null) {
            return root.value >= root.left.value;
        } else {
            if (root.value >= root.left.value && root.value >= root.right.value) {
                return isHeapUtil(root.left) && isHeapUtil(root.right);
            } else {
                return false;
            }
        }
    }

    boolean isHeap(Node root) {
        if (root == null) {
            return true;
        }
        int node_count = count(root);

        if (isCompleteUtil(root, 0, node_count) == true && isHeapUtil(root) == true) {
            return true;
        }
        return false;
    }
}
