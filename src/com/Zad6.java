package com;


public class Zad6 {

        public static int sumOfDigits(int n)
        {
            int a = 0;

            while (n > 0)
            {
            a +=( n % 10);
            n/= 10;
            }
            return a;
        }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

}
