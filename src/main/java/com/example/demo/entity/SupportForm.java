package com.example.demo.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SupportForm {
	
	@NotNull
	@Min(value=10000, message = "customer ID should be >= 10000")
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 50)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	private String gender;
	
	@NotNull
	private String membership;
	
	@NotNull
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		
		return "Name: " + name + "/n Email: " + email + "/n Gender: " + gender + "/n Membership: " + membership;
	}

}
