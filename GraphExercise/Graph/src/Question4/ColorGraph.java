/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class ColorGraph {

    private int [][] a;
    private String label[];
    private int n;

    public ColorGraph() {
    }
    
    
    public void setAMatrix(int [][] b, int m){
        a = b;
        n=m;
    }
    public void setLabel(String [] c){
        label=c;
    }

    public boolean colorGraphing(int m, int i, int[] color,String s){
            if (i == n) {
                if (isSafe(color)){
                    print(color,s);
                    return true;
                }
                return false;
            }
            for (int j = 1; j <= m; j++){
                color[i] = j;
                if (colorGraphing(m, i + 1, color,s))
                    return true;
                color[i] = 0;
            }
            return false;
    }
    
    public boolean isSafe(int[] color){
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (a[i][j]==1 && color[j] == color[i])
                        return false;
            return true;
    }
    
    public void print(int[] color,String s){
            System.out.println("Color of each verices:");
            for (int i = 0; i < n; i++) {
                System.out.print(" " + label[i]);
            }
            System.out.println("");
            for (int i = 0; i < n; i++){
                System.out.print(" " + color[i]);
            }          
            System.out.println();
            for (int i = 0; i < n; i++){
                if(s.equals(label[i])){
                    System.out.print("Color of "+s+": ");
                    System.out.println(color[i]);
                }
            } 
    }

    public static void main(String args[]) {
        int graph[][] = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0},
        };
        String label[] = {"A","B","C","D"};
        ColorGraph c = new ColorGraph();
        c.setAMatrix(graph, graph.length);
        c.setLabel(label);
        
        int theme = 10; 

        int[] color = new int[graph.length];
        for (int i = 0; i < graph.length; i++) color[i] = 0;

        String s="C";//find C
        if (!c.colorGraphing(theme, 0, color,s))
        System.out.println("Coloring graph doesn't exist!");

    }
}
