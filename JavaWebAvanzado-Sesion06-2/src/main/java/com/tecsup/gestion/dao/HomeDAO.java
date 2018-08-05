package com.tecsup.gestion.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.model.User;

@Repository
public class HomeDAO {

	private static final Logger logger = LoggerFactory.getLogger(HomeDAO.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public User getUser(int id) {

		logger.info("get User ....!");

		// Obtener parametros
		Object[] args = new Object[] { id };
		// Definir consultar
		String query = " SELECT employee_id, login, password, first_name, last_name, email, salary, department_id, address "
				+ " FROM employees " + " WHERE employee_id = ? ";
		// Hacer la consulta -- Mapper
		User usr = (User) jdbcTemplate.queryForObject(query, args, new UserMapper());

		// Retornar resultado
		return usr;

	}

	public User getUserByName(String first_name) {
		logger.info("get User ....!");
		// Obtener parametros
		Object[] args = new Object[] { first_name };
		// Definir consultar
		String query = " SELECT employee_id, login, password, first_name, last_name, email, salary, department_id, address "
				+ " FROM employees " + " WHERE first_name = ? ";
		// Hacer la consulta -- Mapper
		User usr = (User) jdbcTemplate.queryForObject(query, args, new UserMapper());

		// Retornar resultado
		return usr;
	}

	public User getUserByUserYPass(String username, String password) {
		logger.info("get getUserByName ....!");
		// Obtener parametros
		Object[] args = new Object[] { username, password };
		// Definir consultar
		String query = " SELECT employee_id, login, password, first_name, last_name, email, salary, department_id, address "
				+ " FROM employees " + " WHERE login=? AND password=? ";
		// Hacer la consulta -- Mapper
		User usr = (User) jdbcTemplate.queryForObject(query, args, new UserMapper());

		// Retornar resultado
		return usr;
	}
}
