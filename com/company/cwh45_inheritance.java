package com.company;
class base{
  public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("now settting x");
        this.x = x;
    }

    public void printme(){
        System.out.println("iam a counstructor");
    }
}

class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class cwh45_inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(4);
        System.out.println(b.getX());
        derived d=new derived();
        d.setX(84);
        System.out.println(d.getX());

    }
}
