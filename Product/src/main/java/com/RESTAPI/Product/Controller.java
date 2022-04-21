package com.RESTAPI.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	ModelRepository repo;

	@GetMapping(path="getdata")
	List<Model> getmodels(){
		return repo.findAll();
	}
}
