package com.hardy.app.test.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hardy.app.test.po.User;
import com.hardy.app.test.service.UserService;

@ParentPackage("struts-default")
@Namespace("/test")
@Component
public class UserAction {

	@Autowired
	private UserService userService;

	private List<User> users;
	private String userId;
	private String name;
	private String password;
	private String age;

	private String message;

	@Action(value = "createUser", results = { @Result(name = "success", location = "/WEB-INF/userForm.jsp") })
	public String createUser() {
		message = "Create user";
		return "success";
	}

	@Action(value = "create", results = { @Result(name = "success", type = "redirect", params = { "encode", "true" }, location = "fetchUsers?message=${message}") })
	public String create() {
		User user = getUser();
		userService.createUser(user);
		message = "Create the userId is: '" + userId + "'.";
		return "success";
	}

	@Action(value = "updateUser", results = { @Result(name = "success", location = "/WEB-INF/userForm.jsp") })
	public String updateUser() {
		User user = userService.findByUserId(userId);
		name = user.getName();
		password = user.getPassword();
		age = String.valueOf(user.getAge());
		message = "Update the userId is: '" + userId + "'.";
		return "success";
	}

	@Action(value = "update", results = { @Result(name = "success", type = "redirect", params = { "encode", "true" }, location = "fetchUsers?message=${message}") })
	public String update() {
		User user = getUser();
		userService.updateUser(user);
		message = "Update the userId is: '" + userId + "'.";
		return "success";
	}

	@Action(value = "delete", results = { @Result(name = "success", type = "redirect", params = { "encode", "true" }, location = "fetchUsers?message=${message}") })
	public String deleteUser() {
		userService.deleteUser(userId);
		message = "Delete the userId is: '" + userId + "'.";
		return "success";
	}

	@Action(value = "fetchUsers", results = { @Result(name = "success", location = "/WEB-INF/users.jsp") })
	public String fetchUsers() {
		users = userService.findAll();
		return "success";
	}

	private User getUser() {
		User user = new User();
		user.setUserId(userId);
		user.setName(name);
		user.setPassword(password);
		user.setAge(Integer.parseInt(age));
		return user;
	}

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
