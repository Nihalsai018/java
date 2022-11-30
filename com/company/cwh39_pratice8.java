package com.company;
class employe{
    int salary ;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrat(){
        System.out.println("vibratingggg");
    }
    public void callfrnd(){
        System.out.println("calling tomy frnd");
    }
}
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }

}
class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class game{
    public void hit(){
        System.out.println("he is hitting");
    }
    public void run(){
        System.out.println("he is running");
    }
    public void fire(){
        System.out.println("he is firing");
    }
}

public class cwh39_pratice8 {
    public static void main(String[] args) {
        //problem 1
//        employe nihal=new employe();
//        nihal.setname("nihal gade");
//        System.out.println(nihal.getName());
        //problem 2
//        cellphone vivo = new cellphone();
//        vivo.ring();
//        vivo.vibrat();
//        vivo.callfrnd();

        //problem
//        square sq=new square();
//        sq.side=4;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
        //problem 4
//        rectangle rec=new rectangle();
//        rec.length=12;
//        rec.breath=14;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());
        //problem 5
        game player1=new game();
        player1.fire();
        player1.hit();
        player1.run();

    }
}
