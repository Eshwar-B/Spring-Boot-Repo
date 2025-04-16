package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")

public class MysqlUserDaoImpl implements UserDao{

	public MysqlUserDaoImpl() {
		System.out.println("Mysql :: constructor");
	}
	
	public String findNameById(int id)
	{
		if(id == 1) return "Sita";
		else if(id == 2) return "Rama";
		else return "Invalid id";
	}
	
}
