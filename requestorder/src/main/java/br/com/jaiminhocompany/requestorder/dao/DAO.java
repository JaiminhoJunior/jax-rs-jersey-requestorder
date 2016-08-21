package br.com.jaiminhocompany.requestorder.dao;

import java.util.Collection;

import br.com.jaiminhocompany.requestorder.exception.DAOException;

public interface DAO<T> {

	public void save(T t) throws DAOException;
	
	public void delete(T t) throws DAOException;
	
	public Collection<T> findAll() throws DAOException;
	
}