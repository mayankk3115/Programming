package com.programming.pattern;

import java.util.Scanner;

public class MirroredPrint {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j<=n-i) {
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }


        //inverted mirror
        for(int i=1; i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j<i) {
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
