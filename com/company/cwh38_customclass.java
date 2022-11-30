package com.company;
 class employee{
    int id;
    int salary;
    String name;
    public void printdeatiles(){
        System.out.println("this is my is:"+id);
        System.out.println("this is my name:"+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh38_customclass {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        employee nihal=new employee();
        employee jhon=new employee();
        //setting attriubets
        nihal.id=18;
        nihal.salary=200000;
        nihal.name="nihal gade";
        jhon.id=19;
        jhon.salary=4000000;
        jhon.name="mr jhone";

        //assiging attributes
//        System.out.println(nihal.id);
//        System.out.println(nihal.name);

        nihal.printdeatiles();
        jhon.printdeatiles();
        int salary=nihal.getSalary();
        System.out.println(salary);



    }
}
