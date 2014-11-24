package com.corp.app.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import com.opensymphony.xwork2.ActionSupport;



@SuppressWarnings("serial")
@ParentPackage("admin")
public class AdminAction extends ActionSupport {
	public String login(){
		System.out.println("AdminAction");
		return "success";
	}
	public String index(){
		System.out.println("index");
		return "success";
	}
	public String error(){
		System.out.println("index");
		return "error";
	}
}
