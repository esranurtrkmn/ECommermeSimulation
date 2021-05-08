package core.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.RegisterCheckService;
import entities.concrete.User;

public class RegisterCheckManager implements RegisterCheckService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean firstNameCheck(User user) {
		
		if(!user.getFirstName().isEmpty()) {
			
			if(user.getFirstName().length()>=2) {
				return true;
			}
			
			else {
				System.out.println("The name must be 2 characters at least.");
			}
		}
		
		else {
			System.out.println("The name cannot be blank.");
		}
		
		return false;
		
	}



	@Override
	public boolean lastNameCheck(User user) {
		
		if(!user.getLastName().isEmpty()) {
			if(user.getLastName().length()>=2) {
				return true;
			}
			
			else {
				System.out.println("The lastname must be 2 characters at least.");
			}
		}
		
		else {
			System.out.println("The lastname cannot be blank.");
		}
		
		return false;
	}



	@Override
	public boolean passwordCheck(User user) {

		if(!user.getPassword().isEmpty()) {
			
			if(user.getPassword().length()>=6) {
				return true;
			}
			
			else {
				System.out.println("The password must be 6 characters at least");
			}
		}
		
		else {
			System.out.println("The password cannot be blank.");
		}
		
		return false;
	}



	@Override
	public boolean eMailCheck(User user) {
		
		if(validate(user.geteMail())) {
			return true;
		}
		
		else {
			System.out.println("The e-mail is not in the correct format.");
		}
		
		return false;
	}


	public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
}


	
}
