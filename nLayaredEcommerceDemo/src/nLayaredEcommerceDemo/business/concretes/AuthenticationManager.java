package nLayaredEcommerceDemo.business.concretes;

import java.util.regex.Pattern;

import nLayaredEcommerceDemo.business.abstracts.AuthenticationService;
import nLayaredEcommerceDemo.entities.concretes.User;

public class AuthenticationManager implements AuthenticationService{

	@Override
	public void login(User user, String password, String eMail) {
		if (user.getEmail().equals(eMail) && user.getPassword().equals(password)) {
			System.out.println("Hosgeldiniz :  " + user.getFirstName());
		}
		
	}

	@Override
	public void validate(User user, String firstName, String password) {
		if (user.getFirstName().equals(firstName) && user.getPassword().equals(password)) {
			System.out.println("Dogrulama basarili");
		}
		
	}
	

	@Override
	public boolean checkEmailValid(User user) {
		 
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

		 if (true) {
				Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
				return pattern.matcher(user.getEmail()).find();
			}
		 
			return false;
		
	}

}
