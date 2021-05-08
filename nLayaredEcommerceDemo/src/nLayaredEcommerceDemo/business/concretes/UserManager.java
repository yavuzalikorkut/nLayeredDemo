package nLayaredEcommerceDemo.business.concretes;

import java.util.ArrayList;

import nLayaredEcommerceDemo.business.abstracts.UserService;
import nLayaredEcommerceDemo.core.GoogleService;
import nLayaredEcommerceDemo.dataAccess.abstracts.UserDao;
import nLayaredEcommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	GoogleService googleService;
	
	ArrayList<String> mailList = new ArrayList<String>();

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void add(User user) throws Exception {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6
				&& user.getEmail() != "") 
		{
			mailList.add(user.getEmail());
			if (mailList.contains(user.getEmail())) {
				System.out.println("Bu mail adresi mevcut");
			}
			
			userDao.add(user);
			System.out.println("Kullanici eklendi : " + user.getFirstName());
			
			sendMail();
			
		} else {
			throw new Exception("Eksik veya yanlış bilgi girdiniz, kurallara uyun");
		}
		
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void registerWithGoogle() {
		googleService.registerToSystem("Google ile kayit oldundu");
		
	}
	
	public void sendMail() {
		System.out.println("Kullanici dogrulandi");
	}

}
