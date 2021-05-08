package nLayaredEcommerceDemo.business.abstracts;

import nLayaredEcommerceDemo.entities.concretes.User;

public interface UserService {
	void add(User user) throws Exception;
	void update(User user);
	void delete(User user);
	void registerWithGoogle();
}
