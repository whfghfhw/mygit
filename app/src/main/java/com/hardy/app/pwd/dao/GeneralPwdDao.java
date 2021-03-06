package com.hardy.app.pwd.dao;

import java.io.Serializable;
import java.util.List;

public interface GeneralPwdDao {

	public <T> T findById(Class<T> type, Serializable id);

	public <T> List<T> findAll(Class<T> type);

	public void save(Object... entities);

	public void update(Object... entities);

	public void saveOrUpdate(Object entity);

	public void delete(Object... entities);

	public void deleteById(Class<?> type, Serializable id);

	public void refresh(Object... entities);

	public void flush();
}
