package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.ashokit.dao.UserDao;

@Component
public class UserService {

	
	@Autowired
	@Qualifier("mysql")
	private UserDao dao;

    
//	
//	public UserService()
//	{
//		System.out.println("UserService 0-param :: constructor....");
//	}
//	
//	
//	public UserService(OracleUserDaoImpl oracleUserDaoImpl) {
//		this.oracleUserDaoImpl = oracleUserDaoImpl;
//		System.out.println("UserService 1-param :: constructor....");
//	}
//	
//	
//	public void setUserDao(OracleUserDaoImpl oracleUserDaoImpl) {
//		System.out.println("setUserDao :: SetUser method...");
//		this.oracleUserDaoImpl = oracleUserDaoImpl;
//	}
//	
	
	public void getName(int id)
	{
		String name = dao.findNameById(id);
		System.out.println("From getName function :: " + name);
		System.out.println(dao.getClass().getName());
		System.out.println(dao.hashCode());
	}
			
}
