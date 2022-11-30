package com.company;
class cylinder{
  private  int radius;
  private  int height;

    public cylinder(int radius, int height) { //constructor
        this.radius = radius;
        this.height = height;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius+2*3.14*radius+height;

    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    class rectangle{
        private int length;
        private int breath;

        public rectangle() {
            this.length = 4;
            this.breath = 5;
        }

        public rectangle(int length, int breath) {
            this.length = length;
            this.breath = breath;
        }

        public int getLength() {
            return length;
        }

        public int getBreath() {
            return breath;
        }
    }
}

public class cwh44_ps9constructors {
    public static void main(String[] args) {
//        cylinder cy=new cylinder(12,9);
//        cy.setRadius(12);
//        System.out.println(cy.getRadius());
//        cy.setHeight(10);
//        System.out.println(cy.getHeight());
//        //problem 2
//        System.out.println(cy.surfacearea());
//        System.out.println(cy.volume());
//        //problem 3
        rectangle r=new rectangle();




    }
}
