package com.company;

import java.util.Scanner;

public class Main {
    // comment
    public static void main(String[] args) {
        System.out.println("Hi Amigo"); // lesson 00.02
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if (result == 0) {
            System.out.println("Result is null");
        } else {
            System.out.println("Result is not 0");
        }
    }
}
