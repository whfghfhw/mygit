package com.hardy.app.pwd.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.hardy.app.pwd.po.Tree;
import com.hardy.app.pwd.service.TreeService;

@ParentPackage("json-default")
public class TreeAction {
	@Autowired
	private TreeService treeService;
	private String result;
	private List<Tree> treeList;

	@Action(value = "fetchTreeList", results = { @Result(name = "success", type="json", params={"root", "result"}) })
	public String fetchTreeList() {
		treeList = treeService.findAll();
		this.result = JSON.toJSONString(treeList);
		System.out.println(result);
		return "success";
	}
}
