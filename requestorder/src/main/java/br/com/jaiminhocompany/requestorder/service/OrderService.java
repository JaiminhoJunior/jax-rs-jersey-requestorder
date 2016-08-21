package br.com.jaiminhocompany.requestorder.service;

import java.util.Collection;

import br.com.jaiminhocompany.requestorder.exception.RESTRequestException;
import br.com.jaiminhocompany.requestorder.model.Order;

public interface OrderService {

	public Order save(final Order order) throws RESTRequestException;
	
	public Order findByNumber(final Long number) throws RESTRequestException;
	
	public Collection<Order> findAll() throws RESTRequestException;
	
}