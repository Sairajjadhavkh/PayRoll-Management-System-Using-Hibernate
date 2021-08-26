package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	@Column(length = 1000)
	private String description;
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	public Employee() {
		super();
	}
	public Employee( String name, double salary, String description, Date joinDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.name = name;
		this.salary = salary;
		this.description = description;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", content="  + ", salary=" + salary
				+ ", description=" + description + ", joinDate=" + joinDate + "]";
	}
	
	
	
	
}
