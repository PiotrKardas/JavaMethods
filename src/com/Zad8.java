package com;


public class Zad8 {


    static int numberOfDivisors(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter;
    }

    public static boolean isPrime(int n) {
        return numberOfDivisors(n) == 2 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
