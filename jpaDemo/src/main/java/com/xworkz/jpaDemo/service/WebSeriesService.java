package com.xworkz.jpaDemo.service;

import com.xworkz.jpaDemo.entity.WebSeries;

public interface WebSeriesService {

	boolean validateAndThenSave(WebSeries entity);
	
}
