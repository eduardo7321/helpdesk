package com.edusilvasilva.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edusilvasilva.helpdesk.services.DBService;

@Configuration
@Profile("dev2")
public class DevConfig {
	
	@Autowired
	private DBService dbservice;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	
	@Bean
	public boolean instanciaDB() {
		if(value.equals("create")) {
			this.dbservice.instanciaDB();
		}
		return false;
	}
	
	/*@Bean
	public void instanciaDB() {
		this.dbservice.instanciaDB();		
	}*/
	
}
