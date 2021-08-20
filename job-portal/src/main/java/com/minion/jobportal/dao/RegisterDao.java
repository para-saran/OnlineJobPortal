package com.minion.jobportal.dao;

import com.minion.jobportal.model.UserRegistration;

import java.util.List;

public interface RegisterDao {

  UserRegistration save(UserRegistration userRegistration);

  List<UserRegistration> getAll();

  UserRegistration getById(String id);

  List<UserRegistration> getByName(String name);
}
