package com;


public class Zad13 {


    public static int power(int a , int n)
    {
        int result = 1;
        while(n > 0)
        {
            result *=a;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
}
