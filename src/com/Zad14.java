package com;


public class Zad14 {

    //algorytm Euklidesa
    public static int largestCommonDivisor(int a, int b)

    {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(largestCommonDivisor(42,56));
    }
}
