package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private Integer sal;
	private String dept;

	protected Customer() {}

	public Customer(String firstName, String lastName,Integer sal, String dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%d, firstName='%s', lastName='%s' ,sal='%d',dept='%s']",
				id, firstName, lastName, sal, dept);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getSal() {
		return sal;
	}

	public String getDept() {
		return dept;
	}
}
