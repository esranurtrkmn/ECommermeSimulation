package dataAccess.abstracts;



import java.util.List;


import entities.concrete.User;

public interface UserRepository {

	
	boolean Add(User user);
	boolean loginByCheck(String email, String password);
	List<User> getAll();
	
	
}
