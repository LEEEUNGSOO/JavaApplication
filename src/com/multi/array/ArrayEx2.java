package com.multi.array;

public class ArrayEx2 {
    public void arrayExDemo1(int[][] x){
        //x[0][0]=100;
        //x.length 행 개수
        //x[0].length  열 개수
//        {10,20,30,0},
//        {40,50,60,0},
//        {70,80,90,0},
//        {0,0,0,0}
        for (int i = 0; i <x.length-1 ; i++) {
            for (int j=0;j<x[i].length-1;j++){
                //가로의 합
//                x[0][3]+=x[0][0];
//                x[0][3]+=x[0][1];
//                x[0][3]+=x[0][2];
//
//                x[1][3]+=x[1][0];
//                x[1][3]+=x[1][1];
//                x[1][3]+=x[1][2];
//
//                x[2][3]+=x[2][0];
//                x[2][3]+=x[2][1];
//                x[2][3]+=x[2][2];
                  x[i][x[0].length-1]+=x[i][j];//가로의 합
                   x[x[0].length-1][i]+=x[j][i];//새로의 합
            }//for
            x[x[0].length-1][x[0].length-1]+=x[i][i];

        }//for



    }
    public void print(int [][]m){
        for (int i = 0; i <m.length ; i++) {//행
            for (int j = 0; j < m[i].length; j++) {//열
                System.out.printf("%5d",m[i][j]);//열
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayEx2 a=new ArrayEx2();
        int [][]m={
                {10,20,30,0},
                {40,50,60,0},
                {70,80,90,0},
                {0,0,0,0}
        };
        a.print(m);
        a.arrayExDemo1(m);
        a.print(m);



    }
}
