package com.batch.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vamsh
 *
 */
@Entity
public class User {
	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	
	
	public User() {
		
	}

	public User(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
