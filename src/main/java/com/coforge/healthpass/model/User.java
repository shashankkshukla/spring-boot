package com.coforge.healthpass.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  @Column(unique = true, nullable = false)
  private String username;

  @Column(unique = true, nullable = false)
  private String email;

  @Size(min = 8, message = "Minimum password length: 8 characters")
  private String password;

  //@Size(min = 8, message = "Minimum password length: 8 characters")
  private String orgName;
  
  //@Size(min = 8, message = "Minimum password length: 8 characters")
  private String firstName;
  
  //@Size(min = 8, message = "Minimum password length: 8 characters")
  private String lastName;
  
  @ElementCollection(fetch = FetchType.EAGER)
  List<Role> roles;

  @Column(name = "customerImg" , length = 100000)
  private byte[] customerImg;
  
  @Column(name = "contentType")
  private String contentType;
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }
  public String getOrgName() {
	return orgName;
 }

  public void setOrgName(String orgName) {
	this.orgName = orgName;
  }

  public String getFirstName() {
	return firstName;
  }

  public void setFirstName(String firstName) {
	this.firstName = firstName;
  }

  public String getLastName() {
	return lastName;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public byte[] getCustomerImg() {
	return customerImg;
  }
	
  public void setCustomerImg(byte[] customerImg) {
	this.customerImg = customerImg;
  }
	
  public String getContentType() {
	return contentType;
  }
	
  public void setContentType(String contentType) {
	this.contentType = contentType;
  }

}
