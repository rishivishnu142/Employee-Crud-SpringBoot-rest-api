package com.example.demo.entity;

import java.math.BigDecimal ;
import java.time.LocalDate;

public class Employee {
private long id;
private String name;
private String email;
private String department;
private BigDecimal salary;
private LocalDate joindate;
public Employee(long id, String name, String email, String department, BigDecimal salary, LocalDate joindate) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.department = department;
	this.salary = salary;
	this.joindate = joindate;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public BigDecimal getSalary() {
	return salary;
}
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}
public LocalDate getJoindate() {
	return joindate;
}
public void setJoindate(LocalDate joindate) {
	this.joindate = joindate;
}


}
