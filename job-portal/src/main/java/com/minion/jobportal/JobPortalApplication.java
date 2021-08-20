package com.minion.jobportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class JobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}

	@Bean
  public MongoClientFactoryBean createMongoClientFactoryBean() {
    MongoClientFactoryBean mongoClientFactoryBean = new MongoClientFactoryBean();
    mongoClientFactoryBean.setHost("localhost");
    return mongoClientFactoryBean;
  }

  @Bean
  public MongoDatabaseFactory createMongoDatabaseFactory() throws Exception {
	  return new SimpleMongoClientDatabaseFactory(createMongoClientFactoryBean().getObject(), "minionJobPortal");
  }

  @Bean
  public MongoTemplate createMongoTemplate() throws Exception {
	  return  new MongoTemplate(createMongoDatabaseFactory());
  }

}
