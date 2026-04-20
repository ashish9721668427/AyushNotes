package com.codewithashishsample.ayushnotes;

import java.util.Stack;

public class functionoverloading {
    public static void main(String[] args) {
     int x=sum(2,8);
     System.out.println(x);
     int y= sum(6,9,7);
     System.out.println(y);
     int z=sum(3,7);
             System.out.println(z);
 greet(78,"Ashish");
    }
  static int sum(int a,int b){
        return a+b;
  }
  static int sum(int a,int b,int c) {

      return a + b + c;
  }
  static void greet(int age,String name){
        System.out.println(name+age);
  }
}
