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

    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Sum = "+ sum(n));
    }
    
}
