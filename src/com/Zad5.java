package com;


public class Zad5 {


    public static boolean isPytagorean(int a, int b, int c)
    {
        return a*a+b*b==c*c ? true : false;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 12;

        if(isPytagorean(a,b,c))
            System.out.println("Sa");
        else
            System.out.println("nie sa");
    }
}
