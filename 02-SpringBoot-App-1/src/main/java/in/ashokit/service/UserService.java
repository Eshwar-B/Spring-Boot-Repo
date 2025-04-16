package in.ashokit.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserService {

	public UserService()
	{
		System.out.println("User service constructor executed....");
	}
	
}
