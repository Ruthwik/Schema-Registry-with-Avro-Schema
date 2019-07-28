package com.admission.manager.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.admission.manager.service.AdmissionManagerService;
import com.admission.manager.service.AdmissionManagerServiceImpl;

@Configuration
public class AppConfig {


	@Bean 
	AdmissionManagerService studentManagerService() {
		return new AdmissionManagerServiceImpl();
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
