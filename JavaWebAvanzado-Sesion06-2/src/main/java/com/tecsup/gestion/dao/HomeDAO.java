package com.tecsup.gestion.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDAO {
	private static final Logger logger = LoggerFactory.getLogger(HomeDAO.class);
	public void getUser(String id) {
		logger.info("getUser: " + id);
	}

}
