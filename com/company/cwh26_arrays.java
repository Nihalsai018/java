package com.company;

public class cwh26_arrays {
    public static void main(String[] args) {
       // int[]marks=new int[5];
//        marks[0]=90;
//        marks[1]=80;
//        marks[2]=40;
//        marks[3]=50;
//        marks[4]=60;
//        System.out.println(marks[3]);

        //or

      //  int[]mark={90,79,86,45,34};
        //System.out.println(mark.length);
        //for (int i= mark.length-1;i>0;i--) {
           // System.out.println(mark[i]);

      //  for (int element:mark){
       // System.out.println(element);
       // }


        int[][]flats;
        int[]marks;
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;
        for (int i=0; i< flats.length;i++){
            for( int j=0; j< flats[i  ].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}

