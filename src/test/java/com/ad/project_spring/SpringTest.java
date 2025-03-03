/**
 * 
 */
package com.ad.project_spring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ad.projectspring.dao.DisqueraDAO;

/**
 * 
 */
class SpringTest {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO =  (DisqueraDAO) context.getBean("disqueraDAO");
		
		assertNotNull(disqueraDAO);
		
		System.out.println("Contexto cargado exitosamente. ");
		System.out.println(disqueraDAO);
		
		
		Properties properties =  (Properties) context.getBean("properties");
		
		
		
		System.out.println(properties.get("spring-username"));
		
	}

}
