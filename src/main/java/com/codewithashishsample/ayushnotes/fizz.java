package com.codewithashishsample.ayushnotes;

public class fizz {
    public static void main(String[] args) {
        for(int i=3;i<=30;i++){
            if(i%3==0){
                System.out.println("fizz"+i);
            } else if (i%5==0) {
                System.out.println("buzz"+i);
            }
            else if (i%3==0&&i%5==0){
                System.out.println("fizz and buzz"+i);
            }
        }
    }
}
