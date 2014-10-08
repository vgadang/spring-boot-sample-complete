package com.aol.demo.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.aol.demo.model.Preferences;

@Repository
public interface PreferencesRepository extends MongoRepository<Preferences, String>{

	// Declared Query
	List<Preferences> findByColor(String color);
	
	// Mongo query
    @Query("{ 'color' : ?0 }")
    List<Preferences> findByTheCustomersColor(String color);

}
