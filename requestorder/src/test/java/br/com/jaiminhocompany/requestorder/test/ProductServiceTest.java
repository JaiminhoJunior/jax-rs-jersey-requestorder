package br.com.jaiminhocompany.requestorder.test;

import javax.ws.rs.core.MediaType;

import junit.framework.Assert;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ProductServiceTest extends AbstractServiceTest {

	public static final String ORDER_SERVICE = "/product";

	public static final String OPERATION_FIND_ALL = "/findall";

	public static final String OPERATION_FIND = "/find";

	@Test
	public void findAll() {

		final WebResource webResource = Client.create().resource(
				SERVICE_URI + ORDER_SERVICE + OPERATION_FIND_ALL);

		final ClientResponse response = webResource.type(
				MediaType.APPLICATION_JSON).get(ClientResponse.class);

		final String output = response.getEntity(String.class);

		Assert.assertEquals(200, response.getStatus());

		System.out.println(output);
	}

	@Test
	public void find() {

		final WebResource webResource = Client.create().resource(
				SERVICE_URI + ORDER_SERVICE + OPERATION_FIND).queryParam("code", "123456");

		final ClientResponse response = webResource.type(
				MediaType.APPLICATION_JSON).post(ClientResponse.class, "12346");

		final String output = response.getEntity(String.class);

		Assert.assertEquals(200, response.getStatus());

		System.out.println(output);
	}

}