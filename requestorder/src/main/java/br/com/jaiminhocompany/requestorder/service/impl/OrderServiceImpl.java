package br.com.jaiminhocompany.requestorder.service.impl;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.jaiminhocompany.requestorder.dao.OrderDAO;
import br.com.jaiminhocompany.requestorder.dao.impl.OrderDAOImpl;
import br.com.jaiminhocompany.requestorder.exception.BusinessException;
import br.com.jaiminhocompany.requestorder.exception.RESTRequestException;
import br.com.jaiminhocompany.requestorder.model.Order;
import br.com.jaiminhocompany.requestorder.service.OrderService;

@Path("/order")
public class OrderServiceImpl implements OrderService {

	private final OrderDAO dao;

	public OrderServiceImpl() {

		this.dao = new OrderDAOImpl();
	}

	@Override
	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public Order save(final Order order) throws RESTRequestException {

		return null;
	}

	@Override
	@POST
	@Path("/find")
	@Produces(MediaType.APPLICATION_JSON)
	public Order findByNumber(@PathParam("number") final Long number)
			throws RESTRequestException {

		try {

			return this.dao.findByNumber(number);

		} catch (final BusinessException e) {

			throw new RESTRequestException(e);
		}

	}

	@Override
	@GET
	@Path("/findall")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Order> findAll() throws RESTRequestException {

		try {

			return this.dao.findAll();

		} catch (final BusinessException e) {

			throw new RESTRequestException(e);
		}

	}

}