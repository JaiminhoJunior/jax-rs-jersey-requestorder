package br.com.jaiminhocompany.requestorder.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import br.com.jaiminhocompany.requestorder.dao.ProductDAO;
import br.com.jaiminhocompany.requestorder.exception.DAOException;
import br.com.jaiminhocompany.requestorder.model.Product;

public class ProdutctDAOImpl implements ProductDAO {

	private static final Map<String, Product> DATA = new HashMap<String, Product>();

	public ProdutctDAOImpl() {
		
		if (MapUtils.isEmpty(DATA)) {
			
			DATA.put("12345", new Product("12345", "iRig", "IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices", 57.90D));
			DATA.put("12346", new Product("12346", "iRig HD", "IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices", 79.90D));
			DATA.put("12347", new Product("12347", "iRig Keys", "IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices", 200.90D));
			DATA.put("12348", new Product("12348", "iRig BlueBoard", "IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices", 150.90D));
			DATA.put("12349", new Product("12349", "iRig Midi Interface", "IK Multimedia AmpliTube iRig guitar interface adaptor for iOS devices", 25.90D));
		}
		
	}
	
	@Override
	public void save(final Product product) throws DAOException {

		DATA.put(product.getCode(), product);
	}

	@Override
	public void delete(final Product product) throws DAOException {

		DATA.remove(product);
	}

	@Override
	public Collection<Product> findAll() throws DAOException {
		
		return DATA.values();
	}

	@Override
	public Product findByCode(final String code) throws DAOException {
		
		return DATA.get(code);
	}

}