/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static double addReciprocals(int n){
        if(n == 0) return 0;
        return (1.0/n) + addReciprocals(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Sum = "+addReciprocals(n));
    }
    
}
