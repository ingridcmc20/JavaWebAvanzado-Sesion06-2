package com.tecsup.gestion.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.HomeDAO;

@Service
public class HomeServices {
	private static final Logger logger = LoggerFactory.getLogger(HomeServices.class);
	@Autowired
	HomeDAO homeDAO;

	public void doSomething(String id) {
		logger.info("method something");
		homeDAO.getUser(id);
	}
}
