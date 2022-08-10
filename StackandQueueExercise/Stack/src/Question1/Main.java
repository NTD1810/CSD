/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StackInt x = new StackInt();
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
       int n = sc.nextInt();
       while(n>0){
           x.push(n%2);
           n=n/2;
       }
       x.traveser();       
    }
    
}
