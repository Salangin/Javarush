package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if (result == 0) {
            System.out.println("Result is null");
        } else {
            System.out.println("Result is not 0");
        }
    }
}
