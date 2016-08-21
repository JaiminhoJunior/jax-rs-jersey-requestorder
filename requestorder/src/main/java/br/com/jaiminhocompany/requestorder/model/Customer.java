package br.com.jaiminhocompany.requestorder.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;

@XmlRootElement
public class Customer {

	private String document;

	private String name;

	private String phone;

	private String email;

	public String getDocument() {

		return this.document;
	}

	public void setDocument(final String document) {

		this.document = document;
	}

	public String getName() {

		return this.name;
	}

	public void setName(final String name) {

		this.name = name;
	}

	public String getPhone() {

		return this.phone;
	}

	public void setPhone(final String phone) {

		this.phone = phone;
	}

	public String getEmail() {

		return this.email;
	}

	public void setEmail(final String email) {

		this.email = email;
	}

	@Override
	public int hashCode() {

		return StringUtils.defaultIfBlank(this.document, StringUtils.EMPTY)
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

		final Customer customer = (Customer) obj;

		return StringUtils.equals(
				StringUtils.defaultIfBlank(this.document, StringUtils.EMPTY),
				customer.getDocument());
	}

	@Override
	public String toString() {
		return "Customer [document=" + this.document + ", name=" 
				+ this.name + ", phone=" + this.phone + ", email=" + this.email 
				+ "]";
	}

}