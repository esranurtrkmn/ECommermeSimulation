package dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dataAccess.abstracts.UserRepository;
import entities.concrete.User;

public class HibernateUserRepository implements UserRepository{

	List<User> users = new ArrayList<>();
	

	@Override
	public boolean Add(User user) {
		
		this.users.add(user);
		
		System.out.println("Verification link has been sent to your e-mail.");
		
		return true;
		
	}
	
	
	@Override
	public List<User> getAll() {
		
		return this.users;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		
		for (User user : users) {
            if (user.geteMail() == email && user.getPassword() == password)
             return true;
             }
		
		return false;
	}



	
	
	
	
	



}
