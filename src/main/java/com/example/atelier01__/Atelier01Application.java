package com.example.atelier01__;

import com.example.atelier01__.Dao.entities.Customer;
import com.example.atelier01__.Dao.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Atelier01Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier01Application.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("ADNANE").email("ADNANE@gmail.com").build());
            customerRepository.save(Customer.builder().name("MERYEM").email("MERYEM@gmail.com").build());
        };
    }
}
