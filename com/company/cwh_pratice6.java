package com.company;

public class cwh_pratice6 {
    public static void main(String[] args) {
//        float[] values={1.0f,2.2f,3.3f};
//        float sum=0;
//        for (float element:values){
//            sum=sum+element;
//
//        }
//        System.out.println(sum);

        int[][] mat1= {{1,2,3},
                       {4,5,6}};
        int[][] mat2={{7,8,9},
                      {2,3,4}};
        int[][] result={{0,0,0},
                        {0,0,0}};
        for(int i=0;i< mat1.length;i++){
            for (int j=0;j< mat2[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");

        }
    }
}
