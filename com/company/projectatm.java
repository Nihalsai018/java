package com.company;
import java.util.Scanner;

public class projectatm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("##-----------========---------------##");
        System.out.println("welcome to NAA bank NAA estam");
        System.out.println("bank policey are");
        System.out.println("choose coorect one and sleep well you money is save");
        System.out.println("do graet , choose one, be only one ");
        System.out.println("##-----------========---------------##");
        System.out.println("enter 1 to cash withdraw");
        System.out.println("enter 2 to balance check");
        System.out.println("enter 3 for deposit money");
        System.out.println("enter 4 to exit");
        int a=sc.nextInt();
        if (a==1){
            System.out.println("you are choosen option withdraw");
            System.out.println("enter your four digit pin");
            int pin =sc.nextInt();
            System.out.println("enter the amount above 2000");
            int amount=sc.nextInt();
            System.out.println("wait  for a min your transaction is been processing");
            System.out.println("collect your cash");
            System.out.println("do you want a receipt");
            System.out.println("enter true to want ");
            System.out.println("enter false for dont want");
            boolean recpit=sc.nextBoolean();
            if(recpit){
                System.out.println("take your recepit");
                System.out.println("thanks visit again");
                System.out.println("have a nice day");
            }
            else {
                System.out.println("thanks visit again");
                System.out.println("have a nice day");

            }
        }
        else if (a==2) {
            System.out.println("you are choosen option check balance");
            System.out.println("enter your four digit pin");
            int pin =sc.nextInt();
            System.out.println("wait  for a min your transaction is been processing");
            System.out.println("do you want a receipt");
            System.out.println("enter true to want ");
            System.out.println("enter false for dont want");
            boolean recpit=sc.nextBoolean();
            if(recpit){
                System.out.println("take your recepit");
                System.out.println("thanks visit again");
                System.out.println("have a nice day");
            }
            else {
                System.out.println("thanks visit again");
                System.out.println("have a nice day");

            }



        } else if (a==3) {
            System.out.println("you are choosen deposite option");
            System.out.println("enter account number");
            int ac=sc.nextInt();
            System.out.println("enter deposite amount");
            int am= sc.nextInt();
            System.out.println("your deposite is sucessfully completed");

        }
        else if (a==4) {
            System.out.println("you want to exit");
            System.out.println("-------------------------------------------------");
            System.out.println("you chooise is all time coorect");
            System.out.println(" for selecting naa bank to buily ur carrer");
            System.out.println("sadha me sevallo naa bank na estam");
            System.out.println("--------------------------------------------------");
            System.out.println("enter true to want exit ");
            System.out.println("enter false for dont want exit");
            boolean exit=sc.nextBoolean();
            if(exit){
                System.out.println("tanks for selecting");
                System.out.println("thanks visit again");
                System.out.println("have a nice day");
            }
            else {
                System.out.println("thanks visit again");
                System.out.println("have a nice day");



            }

        }
        else{
            System.out.println("your input is not valid");
        }


    }
}
