package me.umov.auth.service;

import javax.enterprise.context.RequestScoped;

import me.umov.auth.dao.AbstractDao;

@RequestScoped
public abstract class AbstractService<T> {
	
	public T findById(Long id) {
		return getDao().findById(id);
	}
	
	public T save(T instance) {
		setDefaultValues(instance);
		return getDao().save(instance);
	}
	
	protected void setDefaultValues(T instance) {
		// Must be implemented on Concrete Service
	}
	
	protected abstract AbstractDao<T> getDao();
	

}
