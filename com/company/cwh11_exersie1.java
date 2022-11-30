package com.company;
import java.util.Scanner;



public class cwh11_exersie1 {
    public static void main(String[] args) {
        System.out.println("cbse percentage calculator ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter telugu marks :");
        int telugu=sc.nextInt();
        System.out.println("enter hindi marks :");
        int hindi=sc.nextInt();
        System.out.println("enter maths marks :");
        int maths=sc.nextInt();
        System.out.println("enter english marks :");
        int english=sc.nextInt();
        System.out.println("enter science marks :");
        int science=sc.nextInt();
        System.out.println("enter social marks :");
        int social=sc.nextInt();

        float percentage=((telugu+hindi+maths+english+science+social)/600.0f)*100;
        System.out.println("total percentage:"+percentage);







    }
}
