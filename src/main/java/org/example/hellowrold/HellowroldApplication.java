package org.example.hellowrold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowroldApplication {

    public static void main(String[] args) {

       System.out.println("Simulating startup failure...");
        System.exit(1); // Force immediate failure

        SpringApplication.run(HellowroldApplication.class, args);

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World im from newbranch!");
    }

}
