package com.diproject.diproject;

import com.diproject.diproject.controlers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiProjectApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;
	@Test
	void contextLoads() {
	}

	@Test
	void testAutoWireOfController(){
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}



}
