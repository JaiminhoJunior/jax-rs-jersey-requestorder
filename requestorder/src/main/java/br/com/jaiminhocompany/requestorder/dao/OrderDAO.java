package br.com.jaiminhocompany.requestorder.dao;

import br.com.jaiminhocompany.requestorder.exception.DAOException;
import br.com.jaiminhocompany.requestorder.model.Order;

public interface OrderDAO extends DAO<Order> {

	public Order findByNumber(final Long number) throws DAOException;
	
}