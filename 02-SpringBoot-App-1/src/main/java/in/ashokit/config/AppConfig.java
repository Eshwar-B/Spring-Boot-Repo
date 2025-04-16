package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.appSecurity.AppSecurity;

@Configuration
public class AppConfig {

	AppConfig()
	{
		System.out.println("App Config class created...");
	}
	
	@Bean
	public AppSecurity createAppSecurity()
	{
		System.out.println("Create App security method called");
		AppSecurity security = new AppSecurity("AES");
		System.out.println("the algorithm used is : " + security.algorithm);
		return security;
	}
	
}
