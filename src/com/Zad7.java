package com;


public class Zad7 {

    public static boolean isSqrt(int n) {

        int result = (int) Math.sqrt(n);

        return (result * result == n) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isSqrt(25));
    }

}
