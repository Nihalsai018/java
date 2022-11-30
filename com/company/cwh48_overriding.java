package com.company;
class a{
    public int a;
    public int nihal(){
        return 1;

    }
    public void mth2(){
        System.out.println("this is mth2 of class a");
    }
}
class b extends a{
    public void mth3(){
        System.out.println("this is mth3 of class b");
    }
}


public class cwh48_overriding {
    public static void main(String[] args) {
       a n=new a();
        n.mth2();
        b g=new b();
        g.mth3();

    }
}
