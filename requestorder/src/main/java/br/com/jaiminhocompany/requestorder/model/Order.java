package br.com.jaiminhocompany.requestorder.model;

import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

	@XmlElement(name = "number")
	private Long number;

	@XmlElement(name = "emissionDate")
	private Date emissionDate;

	@XmlElement(name = "customer")
	private Customer customer;

	@XmlElement(name = "products")
	private Collection<Product> products;

	public Long getNumber() {

		return this.number;
	}

	public void setNumber(final Long number) {

		this.number = number;
	}

	public Date getEmissionDate() {

		return this.emissionDate;
	}

	public void setEmissionDate(final Date emissionDate) {

		this.emissionDate = emissionDate;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {

		this.customer = customer;
	}

	public Collection<Product> getProducts() {

		return this.products;
	}

	public void setProducts(final Collection<Product> products) {

		this.products = products;
	}

	@Override
	public int hashCode() {

		return this.number != null ? this.number.hashCode() : super.hashCode();
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {

			return true;
		}

		if (obj == null) {

			return false;
		}

		if (this.getClass() != obj.getClass()) {

			return false;
		}

		final Order order = (Order) obj;

		return (this.number != null) && this.number.equals(order.getNumber());
	}

	@Override
	public String toString() {
		return "Order ["
				+ "number=" + this.number 
				+ ", emissionDate=" + this.emissionDate
				+ ", customer=" + this.customer 
				+ ", products=" + this.products 
				+ "]";
	}

}