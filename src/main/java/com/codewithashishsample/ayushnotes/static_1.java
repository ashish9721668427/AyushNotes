package com.codewithashishsample.ayushnotes;//  static jo hain humare variable ho sakte hain or method ho salte hain

// static ka matalab hain object leval se hata ke class level mein lana jasie ki ismein static string collge
public class static_1 {


    public static void main(String[] args) {
        Student s1=new Student("ashish",23,87);
        Student s2=new Student("anuj",22,78);
        System.out.println(s1.name+","+s1.age+","+s1.roll_number+","+Student.collage);
        System.out.println(s2.name+","+s2.age+","+s2.roll_number+","+Student.collage);
    }
}

    class Student {
        String name;
        int age;
        int roll_number;
        static String collage;

        Student(String name, int age, int roll_number) {
            this.name = name;
            this.age = age;
            this.roll_number = roll_number;
        }

        static {
            collage = "IIT KANPUr";
        }
    }
