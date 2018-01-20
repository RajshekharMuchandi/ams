package com.ams.dao;

import java.util.List;

public interface GenericDao<E> {

	public void addEntity(E entity);

	public void updateEntity(E entity);

	public void deleteEntity(E entity);

	public List<E> findAll(Class clazz);
	
	public E findEntityById(Class clazz, String id);

	
}
