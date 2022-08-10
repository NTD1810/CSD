/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Data {
    
    int [][] a;
    int n;
    String label[];

    public Data() {
    }
    
    public void setAMatrix(int [][] b, int m){
        a=b;
        n=m;
    }
    public void setLabel(String c[]){
        label = c;
    }  

    void setAMatrix(int m,int n) {
        int a[][]=new int[m][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void visit(int i) {
     System.out.print(label[i] + "  ");
    } 

    //Breadth first traversal
    public void BFT(int u, boolean[] c) {
        Queue<Object> mq = new LinkedList();
        mq.add(u);
        c[u] = true;
        while (!mq.isEmpty()) {
            int j = (int) mq.poll();
            visit(j);
            for (int i = 0; i < n; i++) {
                if (!c[i] && a[j][i] > 0) {
                    mq.add(i);
                    c[i] = true;
                }
            }
        }
    }

    //Breath first traversal
    public void BFT(int u) {
        boolean[] c = new boolean[n];
        BFT(u, c);
        for (int i = 0; i < n; i++) {
            if (!c[i]) {
                BFT(i, c);
            }
        }
    }

    //Depth first traversal
    public void DFT(int i, boolean[] c) {
        c[i] = true;
        visit(i);
        for (int j = 0; j < n; j++) {
            if (!c[j] && a[i][j] > 0) {
                DFT(j, c);
            }
        }
    }

    public void DFT(int i) {
        boolean[] c = new boolean[n];
        DFT(i, c);
        for (int j = 0; j < n; j++) {
            if (!c[j]) {
                DFT(j, c);
            }
        }

    }
    
    

}
