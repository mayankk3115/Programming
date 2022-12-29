package com.programming.pattern;

import java.util.Scanner;

public class InvertedRightPyramid {

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=num; i>=1;i--) {
            for(int j=1; j<=i;j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();
        scanner.close();

    }
}
