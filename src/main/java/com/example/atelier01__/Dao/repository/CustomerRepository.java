package com.example.atelier01__.Dao.repository;

import com.example.atelier01__.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Long > {
}
