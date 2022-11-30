package com.company;
class base1{
    base1(){
        System.out.println("iam a counstructor");
    }
    base1(int x){
        System.out.println("iam an overload constructor by base"+x);
    }

}
class dervied1 extends base1{
    dervied1(){
       // super(0);
        System.out.println("iam deerived constructor");
    }
    dervied1(int x,int y){
        super(x);
        System.out.println("iam an overloaded by dervied "+y);
    }

}
class childdervied extends dervied1{
    childdervied(){
        System.out.println("iam childdervied constructor");
    }
    childdervied(int x,int y,int z){
        super(x,y);
        System.out.println("iam overloaded od childerived"+z);
    }
}
public class cwh46_coninhertance {
    public static void main(String[] args) {
       // base1 b=new base1();
       // dervied1 d=new dervied1();
       // dervied1 d=new dervied1(4,9);
        childdervied ch=new childdervied(5,8,6);
    }
}
