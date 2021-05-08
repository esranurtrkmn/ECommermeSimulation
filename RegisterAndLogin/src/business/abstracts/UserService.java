package business.abstracts;



import entities.concrete.User;

public interface UserService {

	void Add(User user);
	void Login(String email,String password);
	void loginWithGoogle(User user);
		
	
}
