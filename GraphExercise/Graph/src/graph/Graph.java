/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Graph {

    public static void main(String[] args) {
        int [][]a  = {
            //A  B  C  D  E  F  G  H  I
             {0, 1, 1, 1, 0, 0, 0, 0, 0}, //A
             {1, 0, 1, 1, 0, 0, 0, 0, 0}, //B 
             {1, 1, 0, 1, 0, 0, 0, 0, 0}, //C
             {1, 1, 1, 0, 0, 1, 0, 0, 0}, //D
             {0, 0, 0, 0, 0, 1, 0, 0, 0}, //E
             {0, 0, 0, 1, 1, 0, 0, 0, 0}, //F
             {0, 0, 0, 0, 0, 0, 0, 1, 1}, //G
             {0, 0, 0, 0, 0, 0, 1, 0, 0}, //H
             {0, 0, 0, 0, 0, 0, 1, 0, 0}  //I
        };
        String label_a[] = {"A","B","C","D","E","F","G","H","I"};
        Data g = new Data();
        g.setAMatrix(a, 9);
        g.setLabel(label_a);
        System.out.print("-Breadth first trarvese: ");
        g.DFT(1);//B
        System.out.print("\n-Depth first traverse: ");
        g.BFT(1);//B
        System.out.println("");
    }

}
