package com.company;

public class cwh30_methodoverloading{
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good moring"+a);
    }
    static void change(int a){
        a=98;
    }
    static void change2(int[]arr){
        arr[0]=98;
    }
    public static void main(String[] args) {
        foo();
        foo(50);

    }

}
