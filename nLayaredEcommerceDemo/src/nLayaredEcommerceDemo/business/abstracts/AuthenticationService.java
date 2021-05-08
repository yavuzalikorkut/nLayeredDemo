package nLayaredEcommerceDemo.business.abstracts;

import nLayaredEcommerceDemo.entities.concretes.User;

public interface AuthenticationService {
	void login(User user , String password , String eMail);
	void validate(User user, String firstName, String password);
	boolean checkEmailValid(User user);
}
