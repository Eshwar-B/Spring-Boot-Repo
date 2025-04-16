package in.ashokit.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCmdRunner implements CommandLineRunner
{
	public void run(String... args) throws Exception
	{
		System.out.println("Run method from MyCmdRunner");
		// delete temporary tables data
		// load data into cache
	}

}
