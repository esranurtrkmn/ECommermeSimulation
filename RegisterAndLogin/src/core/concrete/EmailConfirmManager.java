package core.concrete;

import core.abstracts.EmailConfirmService;


public class EmailConfirmManager implements EmailConfirmService{

	@Override
	public boolean confirmEmail(String eMail) {
	
		if(this.isConfirm()) {
			System.out.println("The email is verified. Registration completed.");
			return true;
		}
		else {
			System.out.println("Please verify your email to complete registration.");
		}
		
		
		return false;
	}

	@Override
	public boolean isConfirm() {
		
		return true;
	}

	
	
}
