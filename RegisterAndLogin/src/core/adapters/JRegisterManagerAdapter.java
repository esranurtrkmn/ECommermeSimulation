package core.adapters;

import JLoginWithGoogle.JRegisterManager;
import core.abstracts.RegisterWithGoogleService;
import entities.concrete.User;

public class JRegisterManagerAdapter implements RegisterWithGoogleService{

	@Override
	public boolean registerWithGoogle(User user) {
		
		JRegisterManager registerManager=new JRegisterManager();
		registerManager.register(user);
		
		return true;
	}

	
}
