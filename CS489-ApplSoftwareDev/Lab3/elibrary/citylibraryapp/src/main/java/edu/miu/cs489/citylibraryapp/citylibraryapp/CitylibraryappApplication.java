package edu.miu.cs489.citylibraryapp.citylibraryapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitylibraryappApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CitylibraryappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Data Persistance Using Spring Data JPA");
    }
}
