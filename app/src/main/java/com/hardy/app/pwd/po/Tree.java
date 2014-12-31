package com.hardy.app.pwd.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TREE")
public class Tree implements Serializable {

	private static final long serialVersionUID = -8705058393768196440L;

	@Id
	@Column(name = "ID", length = 11, nullable = false)
	private int id;
	@Column(name = "PID", length = 11, nullable = true)
	private int pid;
	@Column(name = "NAME", length = 64, nullable = true)
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
