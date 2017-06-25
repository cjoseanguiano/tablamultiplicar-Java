package com.devix.www;

public class Main {

    public static void main(String[] args) {

        int i, j, r;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                r = i * j;
                System.out.println(i + " * " + j + " = " + r);
            }
            System.out.println();
        }
    }
}
