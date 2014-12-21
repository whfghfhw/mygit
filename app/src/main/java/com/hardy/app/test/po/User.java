package com.hardy.app.test.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "AC_USER")
public class User implements Serializable {

	private static final long serialVersionUID = -1376216905288707683L;

	@Id
	@Column(name = "USER_ID", length =50, nullable = false)
	private String userId;
	@Column(name = "NAME", length = 50, nullable = false)
	private String name;
	@Column(name = "PASSWORD", length = 50, nullable = false)
	private String password;
	@Column(name = "AGE", length = 20, nullable = false)
	private int age;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
