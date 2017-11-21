package com;


public class Zad9 {



        public static boolean isCube(int n) {

            int result = (int) Math.cbrt(n);

            return (result * result * result == n) ? true : false;
        }

        public static void main(String[] args) {
            System.out.println(isCube(125));
        }

    }

