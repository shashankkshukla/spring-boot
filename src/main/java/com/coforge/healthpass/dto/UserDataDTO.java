package com.coforge.healthpass.dto;

import java.util.List;

import javax.persistence.Column;

import com.coforge.healthpass.model.Role;

import io.swagger.annotations.ApiModelProperty;

public class UserDataDTO {
  
  @ApiModelProperty(position = 0)
  private String username;
  @ApiModelProperty(position = 1)
  private String email;
  @ApiModelProperty(position = 2)
  private String password;
  @ApiModelProperty(position = 3)
  private String orgName;
  @ApiModelProperty(position = 4)
  private String firstName;
  @ApiModelProperty(position = 5)
  private String lastName;
  @ApiModelProperty(position = 6)
  List<Role> roles;
  @ApiModelProperty(position = 7)
  private byte[] customerImg;
  
  @ApiModelProperty(position = 8)
  private String contentType;

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
