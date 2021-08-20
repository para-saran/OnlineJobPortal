package com.minion.jobportal.repository;

import com.minion.jobportal.model.UserRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterRepository extends MongoRepository<UserRegistration, String> {
}
