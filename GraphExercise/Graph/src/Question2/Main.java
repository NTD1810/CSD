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
public class Main {

    /**
     * @param args the command line arguments
     */
    static final int INF=9999;
    public static void main(String[] args) {
        int b[][]={
            //A  B  C  D  E  F 
            {0, 2, 5, 1, INF, INF},//A
            {2, 0, 3, 2, INF, INF},//B
            {5, 3, 0, 3, 1, 5},//C
            {1, 2, 3, 0, 1, INF},//D
            {INF, INF, 1, 1, 0, 2},//E
            {INF, INF, 5, INF, 2, 0},//F
        };
        String l[]={"A","B","C","D","E","F"};
        DijkstraShortest d = new DijkstraShortest();
        d.setAMatrix(b, b.length);
        d.setLabel(l);
        d.ijk(0, 5);//A->F
        System.out.println("");
    }

}
