package com.programming.pattern;

import java.util.Scanner;

public class HalfPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

//        I/P:=3
//        O/P:-
//        1
//        1 2
//        1 2 3

        for (int i=1;i<=num;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println();

//        I/P:=3
//        O/P:-
//        1
//        2 2
//        3 3 3
        for (int i=1;i<=num;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();

//        I/P=3
//        O/P=
//        1
//        2 1
//        3 2 1
        for (int i=1;i<=num;i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
