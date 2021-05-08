package JLoginWithGoogle;

import entities.concrete.User;

public class JRegisterManager {

	public void register(User user) {
		System.out.println("Registered with Google account: " + user.getFirstName());
	}
}
