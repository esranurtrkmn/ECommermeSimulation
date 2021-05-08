
import business.abstracts.UserService;
import business.concrete.UserManager;
import core.adapters.JRegisterManagerAdapter;
import core.concrete.EmailConfirmManager;
import core.concrete.RegisterCheckManager;
import dataAccess.concrete.HibernateUserRepository;

import entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService=new UserManager(new HibernateUserRepository(),new RegisterCheckManager(),new EmailConfirmManager(),
				new JRegisterManagerAdapter());
		
		User user=new User(1,"Esranur","Türkmen","7","turkmenesranur@gmail.com");
		
		
		userService.Add(user);
		
		userService.Login(user.geteMail(),user.getPassword());
		
		userService.loginWithGoogle(user);
		
		
		

	}
		
	

}
