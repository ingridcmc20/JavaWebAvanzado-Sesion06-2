package com.tecsup.gestion.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.HomeDAO;
import com.tecsup.gestion.model.User;

@Service
public class HomeService {

	private static final Logger logger = LoggerFactory.getLogger(HomeService.class);

	@Autowired
	HomeDAO homeDAO;

	public User findUserById(int id) {
		// TODO Auto-generated method stub

		logger.info("method findUserById()");

		User usr = homeDAO.getUser(id);

		return usr;
	}
	
	public User findUserByName(String first_name) {
		// TODO Auto-generated method stub

		logger.info("method findUserByName()");

		User usr = homeDAO.getUserByName(first_name);

		return usr;
	}

}
