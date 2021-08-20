package com.minion.jobportal.service;

import com.minion.jobportal.model.UserRegistration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegisterService {

  UserRegistration save(UserRegistration userRegistration);

  List<UserRegistration> getAll();

  UserRegistration getById(String id);

  List<UserRegistration> getByName(String name);

}
