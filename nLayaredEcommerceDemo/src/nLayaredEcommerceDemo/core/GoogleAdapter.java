package nLayaredEcommerceDemo.core;

import nLayaredEcommerceDemo.googleAuthenticator.GoogleManager;

public class GoogleAdapter implements GoogleService{

	@Override
	public void registerToSystem(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.registerWithGoogle(message);
	}

}
