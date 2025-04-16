package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService user = context.getBean(UserService.class);
		
		System.out.println(user.hashCode());
		
		UserService user2 = context.getBean(UserService.class);
		
		System.out.println(user2.hashCode());
		
	}

}
