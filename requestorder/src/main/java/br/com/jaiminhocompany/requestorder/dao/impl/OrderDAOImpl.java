package br.com.jaiminhocompany.requestorder.dao.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;

import org.apache.commons.lang3.math.NumberUtils;

import br.com.jaiminhocompany.requestorder.dao.OrderDAO;
import br.com.jaiminhocompany.requestorder.exception.DAOException;
import br.com.jaiminhocompany.requestorder.model.Customer;
import br.com.jaiminhocompany.requestorder.model.Order;
import br.com.jaiminhocompany.requestorder.model.Product;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void save(final Order order) throws DAOException {

	}

	@Override
	public void delete(final Order order) throws DAOException {

	}

	@Override
	public Collection<Order> findAll() throws DAOException {

		final Customer customer = new Customer();

		customer.setDocument("05150878901");
		customer.setName("Jaime Vieira Junior");
		customer.setEmail("jaimevieirajunior@gmail.com");
		customer.setPhone("4199985918");

		final Product product = new Product();

		product.setName("iRig");
		product.setDescription("IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices");
		product.setValue(NumberUtils.DOUBLE_ZERO);
		product.setAmount(NumberUtils.INTEGER_ONE);

		final Order order = new Order();

		order.setNumber(NumberUtils.LONG_ONE);
		order.setEmissionDate(Calendar.getInstance().getTime());
		order.setCustomer(customer);
		order.setProducts(Arrays.asList(product));

		return Arrays.asList(order);
	}

	@Override
	public Order findByNumber(final Long number) throws DAOException {
		
		return this.findAll().iterator().next();
	}

}