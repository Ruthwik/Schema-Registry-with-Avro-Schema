package com.student.manager.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.student.manager.service.StudentManagerService;
import com.student.manager.service.StudentManagerServiceImpl;

@Configuration
public class AppConfig {


	@Bean 
	StudentManagerService studentManagerService() {
		return new StudentManagerServiceImpl();
	}
	

	@Bean
	@Qualifier("getHostName")
	public String hostName() {

		InetAddress ip;
		String hostName = null;
		try {
			ip = InetAddress.getLocalHost();
			hostName = ip.getHostName();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		return hostName;
	}
}
