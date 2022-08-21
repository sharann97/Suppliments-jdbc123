package com.suppliments.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.suppliments.model.Suppliments;

public class SupplimentsMapper implements RowMapper<Suppliments> {

	@Override
	public Suppliments mapRow(ResultSet rs, int rowNum) throws SQLException {
		String productName=rs.getString("product_name");
		int  productId =rs.getInt("product_id");
		double price=rs.getDouble("amount");
		String type=rs.getString("type");
		
		
		
		Suppliments suppliments=new Suppliments();
		suppliments.setPrice(price);
	    suppliments.setProductName(productName);
	    suppliments.setProductId(productId);
	    suppliments.setType(type);
	
	return suppliments;	
	}
	
}