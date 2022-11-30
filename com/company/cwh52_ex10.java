package com.company;
class circle{

    public int radius;
    circle(){
        System.out.println("iam circle but non para construcor");
    }
    circle(int r){
        System.out.println("iam circle constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class cylibder extends circle{


    public int height;
    cylibder(int r,int h){
        super(r);
        System.out.println("iam cylinder constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class cwh52_ex10 {
    public static void main(String[] args) {
        //problem1
       // circle objc=new circle(12);
        cylibder obj1=new cylibder(5,6);
    }
}
