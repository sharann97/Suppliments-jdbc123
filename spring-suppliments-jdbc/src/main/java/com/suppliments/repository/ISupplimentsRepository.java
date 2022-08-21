package com.suppliments.repository;

import java.util.List;

import com.suppliments.model.Suppliments;

public interface ISupplimentsRepository {

	void addSuppliments(Suppliments suppliments);
	void updateSuppliments(int productId,double amount);
	void deleteSuppliment(int productId);
	
	List<Suppliments> findByAll();
	List<Suppliments> findByType(String type);
	List<Suppliments> findByProductId(int productId);
	
}