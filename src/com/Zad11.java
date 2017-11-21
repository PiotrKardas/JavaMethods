package com;


public class Zad11 {

    static int numberOfDivisors(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(1200));
    }
}
