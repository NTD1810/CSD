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
public class DijkstraShortest {

    int [][]a;
    String[] label;
    int n;
    static final int INF=9999;
    
    void setAMatrix(int[][]b, int m){
        a=b;
        n=m;
    } 
    void setLabel(String[] c){
        label=c;
    }

    public void ijk(int u, int v) {
        boolean[] c = new boolean[n];
        int[] s = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = u;
            d[i] = a[u][i];
        }
        int curr = u;
        while (curr != v) {
            int k = -1, min = INF;
            for (int i = 0; i < n; i++) {
                if (d[i] < min && !c[i]) {
                    min = d[i];
                    k = i;
                }
            }
            if (min == INF) {
                System.out.println("Shortest path from u to v not found");
                return;
            }
            curr = k;
            c[k] = true;
            for (int i = 0; i < n; i++) {
                if (d[i] > d[k] + a[k][i]) {
                    d[i] = d[k] + a[k][i];
                    s[i] = k;
                }
            }
        }
        System.out.println("Shortest path from u to v is " + d[v]);
        int[] h = new int[n];
        int hn = 0;
        h[hn] = v;
        int[] w = new int[n];
        int wn = 0;
        int x, y = v;
        while (u != v) {
            v = s[v];
            h[++hn] = v;
        }
        for (int i = hn; i >= 0; i--) {
            x = y;
            y = h[i];
            w[wn] = a[x][y];
            wn++;
        }
        System.out.print(label[h[hn]]);
        for (int i = hn - 1; i >= 0; i--) {
            System.out.print("->" + label[h[i]] + "(" + d[h[i]] + ")");
        }
    }
}
