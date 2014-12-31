package com.hardy.app.pwd.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralPwdDAOImpl implements GeneralPwdDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public <T> T findById(Class<T> type, Serializable id) {
		return hibernateTemplate.get(type, id);
	}

	@Override
	public <T> List<T> findAll(Class<T> type) {
		return hibernateTemplate.loadAll(type);
	}

	@Override
	public void save(Object... entities) {
		for (Object entity : entities) {
			hibernateTemplate.save(entity);
		}
	}

	@Override
	public void saveOrUpdate(Object entity) {
		hibernateTemplate.saveOrUpdate(entity);
	}

	@Override
	public void update(Object... entities) {
		for (Object entity : entities) {
			hibernateTemplate.update(entity);
		}
	}

	@Override
	public void delete(Object... entities) {
		for (Object entity : entities) {
			if (entity != null) {
				hibernateTemplate.delete(entity);
			}
		}
	}

	@Override
	public void deleteById(Class<?> type, Serializable id) {
		if (id == null) {
			return;
		}
		Object entity = findById(type, id);
		if (entity == null) {
			return;
		}
		delete(entity);
	}

	@Override
	public void refresh(Object... entities) {
		for (Object entity : entities) {
			hibernateTemplate.refresh(entity);
		}
	}

	@Override
	public void flush() {
		hibernateTemplate.flush();
	}
}
