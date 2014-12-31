package com.hardy.app.pwd.action;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardy.app.pwd.po.Tree;
import com.hardy.app.pwd.service.TreeService;

public class TreeActionTest {

	@Test
	public void testFetchTreeList() {
		List<Tree> treeList = null;
		try {
			AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			TreeService treeService = (TreeService)ctx.getBean("treeService");
			treeList = treeService.findAll();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
