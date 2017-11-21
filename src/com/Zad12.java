package com;


public class Zad12 {


    static int numberOfDivisors(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter;
    }

    public static int maxNumberOfDivisors(int a, int b) {
        int divisors = 0;
        int result = 0;

        for (int i = a; i <= b; i++) {

            if (numberOfDivisors(i) > divisors) {
                divisors = numberOfDivisors(i);
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfDivisors(2, 10000));
    }
}
