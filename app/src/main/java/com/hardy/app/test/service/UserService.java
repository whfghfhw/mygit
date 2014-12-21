package com.hardy.app.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hardy.app.test.dao.GeneralDao;
import com.hardy.app.test.po.User;

@Service
public class UserService {

	@Autowired
	private GeneralDao generalDao;

	public User findByUserId(String userId) {
		return generalDao.findById(User.class, userId);
	}

	public List<User> findAll() {
		return generalDao.findAll(User.class);
	}

	@Transactional
	public void createUser(User user) {
		generalDao.save(user);
	}

	@Transactional
	public void updateUser(User user) {
		generalDao.update(user);
	}

	@Transactional
	public void deleteUser(String userId) {
		generalDao.deleteById(User.class, userId);
	}

	@Transactional
	public void deleteUser(User user) {
		generalDao.delete(user);
	}
}
