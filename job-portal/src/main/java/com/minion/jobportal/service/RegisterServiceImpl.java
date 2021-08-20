package com.minion.jobportal.service;

import com.minion.jobportal.dao.RegisterDao;
import com.minion.jobportal.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegisterServiceImpl implements RegisterService {

  @Autowired
  private RegisterDao registerDao;

  @Override
  public UserRegistration save(UserRegistration userRegistration) {
    return registerDao.save(userRegistration);
  }

  @Override
  public List<UserRegistration> getAll() {
    return registerDao.getAll();
  }

  @Override
  public UserRegistration getById(String id) {
    return registerDao.getById(id);
  }

  @Override
  public List<UserRegistration> getByName(String name) {
    return registerDao.getByName(name);
  }
}
