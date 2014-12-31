package com.hardy.app.pwd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardy.app.pwd.po.Tree;
import com.hardy.app.test.dao.GeneralDao;

@Service
public class TreeService {
	@Autowired
	private GeneralDao generalDao;
	
	public List<Tree> findAll() {
		return generalDao.findAll(Tree.class);
	}

}
