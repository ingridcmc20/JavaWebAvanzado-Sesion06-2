package com.tecsup.gestion.dao;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;

public interface EmployeeDAO {
	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;
}
