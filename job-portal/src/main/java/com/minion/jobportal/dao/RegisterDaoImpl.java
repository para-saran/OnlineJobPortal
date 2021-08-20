package com.minion.jobportal.dao;

import com.minion.jobportal.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegisterDaoImpl implements RegisterDao {

  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public UserRegistration save(UserRegistration userRegistration) {
    return mongoTemplate.save(userRegistration);
  }

  @Override
  public List<UserRegistration> getAll() {
    return mongoTemplate.findAll(UserRegistration.class);
  }

  @Override
  public UserRegistration getById(String id) {
    return null;
  }

  @Override
  public List<UserRegistration> getByName(String name) {
    return mongoTemplate.find(Query.query(Criteria.where("name").is(name)), UserRegistration.class, "register");
  }
}
