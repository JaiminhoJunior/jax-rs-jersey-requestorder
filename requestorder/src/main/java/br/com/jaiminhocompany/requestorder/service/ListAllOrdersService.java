package br.com.jaiminhocompany.requestorder.service;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Response;

import org.json.JSONException;

//@Path("/listorders")
public class ListAllOrdersService {

	// private OrderDAO dao;
	
	@PostConstruct
	public void init() {
		
		// this.dao = new OrderDAOImpl();
	}
	
	//@GET
	//@Produces("application/json")
	public Response listAllOrders() throws JSONException {

		return null;
		
		/*
		final JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Orders", this.dao.findAll());
		
		return Response.status(200).entity(jsonObject).build();
		*/
	}

}