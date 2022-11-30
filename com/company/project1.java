package com.company;
import java.util.Scanner;


public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter 1 to exit");
        System.out.println("enter to 2 to continue");
        System.out.println("enter your choice");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("thanks visit again");
            System.out.println("are your sure");
            System.out.println("enter true for exit");
            System.out.println("enetr false for countiue");
            boolean choose=sc.hasNextBoolean();
            if(choose){
                System.out.println("thanks visit again");
            }
            else{
                System.out.println("ok countiue shopping");
            }


        }
        else {
            System.out.println("keep shoping");
        }


    }
}
