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

import com.tecsup.gestion.model.User;
import com.tecsup.gestion.services.HomeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
	  @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml"),
	  @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
	})
@WebAppConfiguration
public class HomeServiceTest {

	
	private static final Logger logger = LoggerFactory.getLogger(HomeServiceTest.class);

	
	@Autowired
	private HomeService homeService;

	@Test
	public void testGetUserInfo() {

		try {
			//
			
			int I_USER_ID = 100 ;
			String O_ADDRESS = "Av. Lima";
			
			User usr = homeService.findUserById(I_USER_ID);	

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
			
			String I_NAME = "Ingrid" ;
			String O_ADDRESS = "Av. Arequipa";
			
			User usr = homeService.findUserByName(I_NAME);	

			logger.info(usr.toString());
			
			Assert.assertEquals(O_ADDRESS, usr.getAddress());
			
			
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
	
}
