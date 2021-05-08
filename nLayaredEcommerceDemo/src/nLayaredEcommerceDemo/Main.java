package nLayaredEcommerceDemo;

import nLayaredEcommerceDemo.business.abstracts.AuthenticationService;
import nLayaredEcommerceDemo.business.concretes.AuthenticationManager;
import nLayaredEcommerceDemo.business.concretes.UserManager;
import nLayaredEcommerceDemo.core.GoogleAdapter;
import nLayaredEcommerceDemo.dataAccess.abstracts.UserDao;
import nLayaredEcommerceDemo.dataAccess.concretes.HibernateUserDao;
import nLayaredEcommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user1 = new User(1, "ali", "ali", "blabla", "ali@gmail.com");
		User user2 = new User(1, "ayşe", "ayşe", "blabla", "ayşe@gmail.commm");
		
		AuthenticationManager authManager = new AuthenticationManager();
		UserManager manager = new UserManager(new HibernateUserDao(), new GoogleAdapter());
		
		manager.add(user1);
		System.out.println(authManager.checkEmailValid(user1));
		System.out.println(authManager.checkEmailValid(user2));
		authManager.login(user1, "ali@gmail.com@gmail.com", "blabla");

	}

}
