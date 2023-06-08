package com.xworkz.jpaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.jpaDemo.entity.WebSeries;
import com.xworkz.jpaDemo.repository.WebSeriesRepo;

@Service
public class WebSeriesServiceImpl implements WebSeriesService {

	@Autowired
	private WebSeriesRepo repo;
	
	@Override
	public boolean validateAndThenSave(WebSeries entity) {
		boolean save = repo.save(entity);
		return save;
	}


}
