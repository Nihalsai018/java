package com.company;

public class cwh32_varargs {
    static int sum(int...arr){
        int result =0;
        for(int a:arr){
            result=result+a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));

    }
}
