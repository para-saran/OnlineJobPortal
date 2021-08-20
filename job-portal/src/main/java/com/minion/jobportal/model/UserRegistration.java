package com.minion.jobportal.model;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "register")
public class UserRegistration {

  @MongoId
  private String id;
  private String name;
  private String expertise;
  private String emailId;
  private Binary file;

  public UserRegistration(String id, String name, String expertise, String emailId, Binary file) {
    this.id = id;
    this.name = name;
    this.expertise = expertise;
    this.emailId = emailId;
    this.file = file;
  }

  public UserRegistration() {
  }

  public UserRegistration(String name, String expertise, String emailId, Binary file) {
    this.name = name;
    this.expertise = expertise;
    this.emailId = emailId;
    this.file = file;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExpertise() {
    return expertise;
  }

  public void setExpertise(String expertise) {
    this.expertise = expertise;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public Binary getFile() {
    return file;
  }

  public void setFile(Binary file) {
    this.file = file;
  }
}
