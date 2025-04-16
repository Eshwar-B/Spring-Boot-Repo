package in.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ReportService {

	public ReportService()
	{
		System.out.println("Report Service :: constructor called...");
	}
	
	
	@PostConstruct
	public void init1()
	{
		System.out.println("Report service :: init() called...");
	}
	
	
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Report service :: destroy() called...");
	}
}
