package br.com.jaiminhocompany.requestorder.dao;

import br.com.jaiminhocompany.requestorder.exception.DAOException;
import br.com.jaiminhocompany.requestorder.model.Product;

public interface ProductDAO extends DAO<Product> {

	public Product findByCode(final String code) throws DAOException;
	
}