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
	 * @param lastName
	 * @return
	 */
	List<Customer> findByLastName(String lastName);

	/**
	 * Annotated sql query
	 * @param firstName
	 * @return
	 */
	@Query("select c from Customer c where c.lastName = ?1")
	List<Customer> findByLastNameUsingSql(String lastName);
}
