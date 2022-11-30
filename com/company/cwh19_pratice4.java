package com.company;
import java.util.Scanner;

public class cwh19_pratice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //question2
//        System.out.println("enter subject 1 marks");
//        int m1=sc.nextInt();
//        System.out.println("enter subject 2 marks");
//        int m2=sc.nextInt();
//        System.out.println("enter subject 3 marks");
//        int m3=sc.nextInt();
//        int sum=m1+m2+m3;
//        float percentage=(sum/300.0f)*100;
//        System.out.println(percentage);
//
//        if (percentage>=33 ){
//            System.out.println("you are pass");
//        }
//        else {
//            System.out.println("you are fail");
//        }
        //question 4
//        System.out.println("enter number");
//        int day=sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("monday");
//            break;
//            case 2:
//                System.out.println("tuesday");
//            break;
//
//            case 3:
//                System.out.println("wensday");
//            break;
//            case 4:
//                System.out.println("thursday");
//            break;
//            case 5:
//                System.out.println("friday");
//            break;
//            case 6:
//                System.out.println("saturday");
//            break;
//            case 7:
//                System.out.println("sunday");
//            break;
//            default:
//                System.out.println(" sorry ..! ur number is not in cout");



      //  }

        //question 6
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("this is comerical website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("this is organizational website");

        }
        else if(website.endsWith(".in")){
            System.out.println("this in indian website");
        }
        else {
            System.out.println("sorry..! this in not in list");
        }


    }
}
