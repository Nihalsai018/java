package com.company;

public class chw35_praticeset {
 //   problem 1
//    static void multiplication(int n){
//        for(int i=1; i<=10;i++){
//            System.out.format("%d * %d=%d\n",n,i,n*i);
//        }
//    }
//    public static void main(String[] args) {
//        multiplication(9);
//        System.out.println();
//        //problem 1

    //problem 2
//    static void pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }
    static int sum(int n){
        if(n==1) {
            return 1;
        }
        return n+sum(n-1);
    }


    public static void main(String[] args) {
        sum(3);

    }


}
