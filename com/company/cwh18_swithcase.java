package com.company;
import java.util.Scanner;

public class cwh18_swithcase {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are adult");
                break;
            case 25:
                System.out.println("you are ready to marry");
                break;
            case 60:
                System.out.println("ready to die");
                break;
            default:
                System.out.println("u r not in list");

        }







//        if (age>=60){
//            System.out.println("you are old person");
//        }
//        else if (age>=18 && ) {
//            System.out.println("you are young");
//
//        }
//        else {
//            System.out.println("you are kid");
//        }


    }
}
