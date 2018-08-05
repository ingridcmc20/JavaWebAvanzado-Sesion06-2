package com.tecsup.gestion.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.model.User;

@Repository
public class HomeDAO {

	private static final Logger logger 
		= LoggerFactory.getLogger(HomeDAO.class);
	
	public User getUser(int id) {
		// TODO Auto-generated method stub
		
		logger.info("get User ....!");
		
		User usr = new User();
		
		return usr;
		
	}


}
