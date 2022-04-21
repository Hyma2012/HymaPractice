package com.RESTAPI.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {
	
	@Override
	List<Model> findAll();
	


}
