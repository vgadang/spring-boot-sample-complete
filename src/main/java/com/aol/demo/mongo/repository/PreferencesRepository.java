package com.aol.demo.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aol.demo.model.Preferences;

@Repository
public interface PreferencesRepository extends MongoRepository<Preferences, String>{

}
