package com.company;

import java.util.Scanner;

public class Main {
    /*
    00.06 comment
    */
    public static void main(String[] args) {
        System.out.println("Hi Amigo"); // lesson 00.02
        int a; // lesson 00.04
        System.out.println("Это не баг, это фича."); // 00.08
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if (result == 0) {
            System.out.println("Result is null");
        } else {
            System.out.println("Result is not 0");
        }
    }
}
