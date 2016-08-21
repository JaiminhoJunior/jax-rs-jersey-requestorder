package br.com.jaiminhocompany.requestorder.service.impl;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.jaiminhocompany.requestorder.dao.ProductDAO;
import br.com.jaiminhocompany.requestorder.dao.impl.ProdutctDAOImpl;
import br.com.jaiminhocompany.requestorder.exception.DAOException;
import br.com.jaiminhocompany.requestorder.exception.RESTRequestException;
import br.com.jaiminhocompany.requestorder.model.Product;
import br.com.jaiminhocompany.requestorder.service.ProductService;

@Path("/product")
public class ProductServiceImpl implements ProductService {

	private final ProductDAO dao;

	public ProductServiceImpl() {

		this.dao = new ProdutctDAOImpl();
	}

	@Override
	@POST
	@Path("/find")
	@Produces(MediaType.APPLICATION_JSON)
	public Product findByCode(final String code) throws RESTRequestException {

		try {

			return this.dao.findByCode(code);

		} catch (final DAOException e) {

			throw new RESTRequestException(e);
		}

	}

	@Override
	@GET
	@Path("/findall")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Product> findAll() throws RESTRequestException {

		try {

			return this.dao.findAll();

		} catch (final DAOException e) {

			throw new RESTRequestException(e);
		}

	}

}