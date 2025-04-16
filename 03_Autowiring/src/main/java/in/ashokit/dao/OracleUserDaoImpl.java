package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component("oracle")

public class OracleUserDaoImpl implements UserDao{

	public OracleUserDaoImpl() {
		System.out.println("UserDaoImpl :: constructor");
	}
	
	public String findNameById(int id)
	{
		if(id == 1) return "Sita";
		else if(id == 2) return "Rama";
		else return "Invalid id";
	}
	
}
