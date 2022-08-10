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
public class MST {

    int[][] a;
    String label[];
    int n;

    public void setAMatrix(int[][] b, int m) {
        a = b;
        n = m;
    }

    public void setLabel(String[] c) {
        label = c;
    }

    public void minimumST() {
        int miniSpanTree[] = new int[n];
        int key[] = new int[n];
        Boolean mstSet[] = new Boolean[n];
        for (int i = 0; i < n; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        miniSpanTree[0] = -1;
        for (int i = 0; i < n - 1; i++) {
            int u = findMin(key, mstSet);
            mstSet[u] = true;
            for (int j = 0; j < n; j++) {
                if (a[u][j] != 0 && mstSet[j] == false && a[u][j] < key[j]) {
                    miniSpanTree[j] = u;
                    key[j] = a[u][j];
                }
            }
        }

        print(miniSpanTree);
    }

    public int findMin(int key[], Boolean mstSet[]) {
        int min = Integer.MAX_VALUE;
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (mstSet[i] == false && key[i] < min) {
                min = key[i];
                pos = i;
            }
        }

        return pos;
    }

    public void print(int miniSpanTree[]) {
        int sumWeight = 0;
        System.out.println("Edge - Weight".toUpperCase());
        for (int i = 1; i < n; i++) {
            System.out.println(label[miniSpanTree[i]] + " - " + label[i] + ":\t" + a[i][miniSpanTree[i]]);
            sumWeight += a[i][miniSpanTree[i]];
        }
        System.out.println("Total: "+sumWeight);
    }

    public static void main(String[] args) {
        MST t = new MST();
        int graph[][] = new int[][]{{0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0}};
        String b[] = {"A", "B", "C", "D", "E"};
        t.setAMatrix(graph, graph.length);
        t.setLabel(b);
        t.minimumST();
    }

}
