package core.abstracts;

import entities.concrete.User;

public interface RegisterCheckService {
	
	boolean firstNameCheck(User user);
	boolean lastNameCheck(User user);
	boolean passwordCheck(User user);
	boolean eMailCheck(User user);

}
