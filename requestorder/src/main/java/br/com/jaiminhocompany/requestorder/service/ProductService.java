package br.com.jaiminhocompany.requestorder.service;

import java.util.Collection;

import br.com.jaiminhocompany.requestorder.exception.RESTRequestException;
import br.com.jaiminhocompany.requestorder.model.Product;

public interface ProductService {

	public Product findByCode(final String code) throws RESTRequestException;
	
	public Collection<Product> findAll() throws RESTRequestException;
	
}