
package com.codewithashishsample.ayushnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AyushNotesApplication {

    public static void main(String[] args) {
        System.out.println("hello");  // ✅ correct
        SpringApplication.run(AyushNotesApplication.class, args);
    }
}