package com.aol.demo.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aol.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

	List<Customer> findByLastName(String lastName);

}
