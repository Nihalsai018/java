package com.company;

public class cwh9_precedence {
    public static void main(String[] args) {
        int a=6*5-34/2;
        int b=60/5-34*2;
        /* =30-34/2
           =30-17
           =13
            higest precedence to * and / ther are eveluated from left to right
            =12-34*2
            =12-68
            =-56


         */

        System.out.println(a); //precedence and associavity
    }
}
