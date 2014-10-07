package com.aol.demo.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aol.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

	/**
	 * Declared Query
	 */
	List<Customer> findByLastName(String lastName);

	/**
	 * Annotated sql query
	 */
	@Query("select c from Customer c where c.lastName = ?1")
	List<Customer> findByLastNameUsingSql(String lastName);
	
	/**
	 * Declared Query for last name starting with
	 */
	List<Customer> findByLastNameStartingWith(String lastNamePrefix);
	
}
