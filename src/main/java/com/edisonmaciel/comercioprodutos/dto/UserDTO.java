package com.edisonmaciel.comercioprodutos.dto;

import java.io.Serializable;

import com.edisonmaciel.comercioprodutos.entities.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	
	public UserDTO () {
		
	}

	public UserDTO (User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
		phone = obj.getPhone();
		
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
