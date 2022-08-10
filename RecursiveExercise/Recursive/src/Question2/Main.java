/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Thùy Dương
 */
public class Main {

    public static int findmin(int a[],int n){
        if(n==1) return a[0];
        else{
            if(a[n-1]<findmin(a,n-1))
                return a[n-1];
            return findmin(a,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = Integer.parseInt(sc.nextLine());
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element " +(i+1)+" = ");
            a[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("min = "+findmin(a, n));
    }
    
}
