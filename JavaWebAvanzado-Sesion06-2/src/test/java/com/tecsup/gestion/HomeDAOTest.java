package com.tecsup.gestion;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.dao.HomeDAO;
import com.tecsup.gestion.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml"),
		@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml") })
@WebAppConfiguration
public class HomeDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(HomeDAOTest.class);

	@Autowired
	HomeDAO homeDAO;

	@Test
	public void testGetUserInfo() {

		try {
			//

			int I_USER_ID = 100;
			String O_ADDRESS = "Av. Lima";

			User usr = homeDAO.getUser(I_USER_ID);

			logger.info(usr.toString());

			Assert.assertEquals(O_ADDRESS, usr.getAddress());

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testGetUserInfoByName() {

		try {
			//

			String I_NAME = "Ingrid";
			String O_ADDRESS = "Av. Arequipa";

			User usr = homeDAO.getUserByName(I_NAME);

			logger.info(usr.toString());

			Assert.assertEquals(O_ADDRESS, usr.getAddress());

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
	
	@Test
	public void testGetUserInfoByUserYPass() {

		try {
			//

			String I_USERNAME = "imendoza";
			String I_PASSWORD = "123456";
			String O_LASTNAME = "Mendoza";

			User usr = homeDAO.getUserByUserYPass(I_USERNAME, I_PASSWORD);

			logger.info(usr.toString());

			Assert.assertEquals(O_LASTNAME, usr.getLastname());

		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
}
