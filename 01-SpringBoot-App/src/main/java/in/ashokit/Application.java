package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	public String msg()
	{
		System.out.println("Msg function called...");
		return "Hello Eshwar !! , Welcome to Spring Boot...";
	}
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		System.out.println(run.getClass().getName());
		System.out.println(run.getBeanDefinitionCount());
		
	}

}
