package com.aol.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.aol.demo.jpa.repository.CustomerRepository;
import com.aol.demo.model.Customer;

public class CustomerRepositoryStub implements CustomerRepository {

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInBatch(Iterable<Customer> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Customer> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findOne(String arg0) {
		Customer customer = new Customer();
		customer.setFirstName("Stub first");
		customer.setLastName("Stub last");
		customer.setScreenName("Stub screenname");
		return customer ;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByLastNameUsingSql(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByLastNameStartingWith(String lastNamePrefix) {
		// TODO Auto-generated method stub
		return null;
	}

}
