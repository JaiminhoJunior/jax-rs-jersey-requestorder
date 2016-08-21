package br.com.jaiminhocompany.requestorder.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

@XmlRootElement
public class Product {

	private String code;

	private String name;

	private String description;

	private Integer amount;

	private Double value;

	public Product(final String code, final String name, final String description,
			final Double value) {
		
		this.code = code;
		this.name = name;
		this.description = description;
		this.amount = NumberUtils.INTEGER_ONE;
		this.value = value;
	}
	
	public Product() {

	}

	@XmlElement(name = "code")
	public String getCode() {

		return this.code;
	}

	public void setCode(final String code) {

		this.code = code;
	}

	@XmlElement(name = "name")
	public String getName() {

		return this.name;
	}

	public void setName(final String name) {

		this.name = name;
	}

	@XmlElement(name = "description")
	public String getDescription() {

		return this.description;
	}

	public void setDescription(final String description) {

		this.description = description;
	}

	@XmlElement(name = "amount")
	public Integer getAmount() {

		return this.amount;
	}

	public void setAmount(final Integer amount) {

		this.amount = amount;
	}

	@XmlElement(name = "value")
	public Double getValue() {

		return this.value;
	}

	public void setValue(final Double value) {

		this.value = value;
	}

	@Override
	public int hashCode() {

		return StringUtils.defaultIfBlank(this.code, StringUtils.EMPTY)
				.hashCode();
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

		final Product product = (Product) obj;

		return StringUtils.equals(
				StringUtils.defaultIfBlank(this.code, StringUtils.EMPTY),
				product.getCode());
	}

	@Override
	public String toString() {
		return "Product [code=" + this.code + ", name=" + this.name
				+ ", description=" + this.description + ", amount="
				+ this.amount + ", value=" + this.value + "]";
	}

}