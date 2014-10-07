package com.aol.demo;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages={"com.aol.demo.mongo.repository"})
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Value("${mongo.dbname}")
	private String databaseName;

	@Value("${mongo.username}")
	private String username;
	
	@Value("${mongo.password}")
	private String password;

	@Value("${mongo.host}")
	private String host;

	@Value("${mongo.port")
	private int port;

	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		UserCredentials userCredentials = new UserCredentials(username, password);
		return new SimpleMongoDbFactory(mongo(), databaseName, userCredentials);
	}

	@Bean
	public Mongo mongo() throws UnknownHostException {
		return new MongoClient(host, port);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDbFactory());
	}

	@Override
	protected String getDatabaseName() {
		return databaseName;
	}

}