/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {
    public static int firstKindStirling(int n, int k){
        if (n==0 && k == 0) return 1;
        else if(n==0 || k==0) return 0;
        return firstKindStirling(n-1, k-1) - (n-1)*firstKindStirling(n-1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
         int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter k =");
        int k = Integer.parseInt(sc.nextLine());
        System.out.println("Result = "+firstKindStirling(n,k));
    }
    
}
