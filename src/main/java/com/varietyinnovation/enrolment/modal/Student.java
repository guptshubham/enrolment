package com.varietyinnovation.enrolment.modal;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;


@Entity
@Table(name = "tb_stu",uniqueConstraints={@UniqueConstraint(columnNames = {"phone_no" , "email"})})
public class Student {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column
 private Integer SNo;
@Column
 private String std_name;
@Column
 private String fth_name;
@Column
 private Date dob;
@Column
 private String address;
@Column
private String city;
@Column
private String state;
@Column
private String pin;
@Column

private Long phone_no;
@Column
@Basic
@Pattern(regexp = "\\w+@\\w+\\.\\w+(,\\s*\\w+@\\w+\\.\\w+)*")
private String email;

@Column
@Min(value=5)  
@Max(value=10)  
private Integer cls_opt;

@Column
private String marks;

@Column

private Date date_enrol;

@Override
 public String toString() {
  return "Student [SNo= " + SNo + ", std_name=" + std_name + ", fth_name=" + fth_name + ", dob=" + dob + ", address="
    + address + ",city= " + city + ",state= " + state + ",pin= " + pin + ",phone_no= " + phone_no + ",email= " + email + ",cls_opt= " + cls_opt + ",marks= " + marks + ",date_enrol= " + date_enrol + "]";
 }
public Integer getSNo() {
  return SNo;
 }
public void setId(Integer SNo) {
  this.SNo = SNo;
 }
public String getStd_name() {
	return std_name;
}
public void setStd_name(String std_name) {
	this.std_name = std_name;
}
public String getFth_name() {
	return fth_name;
}
public void setFth_name(String fth_name) {
	this.fth_name = fth_name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public Long getPhone_no() {
	return phone_no;
}
public void setPhone_no(Long phone_no) {
	this.phone_no = phone_no;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getCls_opt() {
	return cls_opt;
}
public void setCls_opt(Integer cls_opt) {
	this.cls_opt = cls_opt;
}
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public Date getDate_enrol() {
	return date_enrol;
}
public void setDate_enrol(Date date_enrol) {
	this.date_enrol = date_enrol;
}

}