//package com.codewithashishsample.ayushnotes;
//
//public class pattern_5 {
//    public static void main(String[] args) {
//        for(int row=1;row <=5;row++){
//            for (int colm=1;colm<=row;colm++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int rows=5;rows>=1;rows--){
//            for(int colms=1;colms<=rows;colms++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


public class pattern_5 {
    public static void main(String[] args) {
        for (int row =1;row<=5;row++){
            for(int colm=1;colm<=row;colm++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int rows=5;rows>=1;rows--){
            for(int com=1;com<=rows;com++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
























