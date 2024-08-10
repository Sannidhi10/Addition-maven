package com.example;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
