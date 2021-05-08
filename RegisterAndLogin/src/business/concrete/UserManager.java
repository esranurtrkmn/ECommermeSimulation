package business.concrete;


import java.util.ArrayList;
import java.util.List;


import business.abstracts.UserService;
import core.abstracts.EmailConfirmService;
import core.abstracts.RegisterCheckService;
import core.abstracts.RegisterWithGoogleService;
import dataAccess.abstracts.UserRepository;

import entities.concrete.User;

public class UserManager implements UserService{
	
	
    private UserRepository userRepository;
    private RegisterCheckService registerCheckService;
    private EmailConfirmService eMailConfirmService;
    private RegisterWithGoogleService registerWithGoogleService;
          
	
	public UserManager(UserRepository userRepository, RegisterCheckService registerCheckService,
			EmailConfirmService eMailConfirmService,RegisterWithGoogleService registerWithGoogleService) {
		
		
		this.userRepository = userRepository;
		this.registerCheckService=registerCheckService;
		this.eMailConfirmService=eMailConfirmService;
		this.registerWithGoogleService=registerWithGoogleService;
	}
	

	@Override
	public void Add(User user) {
		
		if(registerCheckService.firstNameCheck(user) && registerCheckService.lastNameCheck(user) && 
				registerCheckService.passwordCheck(user) && registerCheckService.eMailCheck(user)) {
			
			if(this.userRepository.Add(user)) {
				
				eMailConfirmService.confirmEmail(user.geteMail());
				
			}	
		}
						
	}
	

	
	@Override
	public void Login(String email,String password) {
			
		if(userRepository.loginByCheck(email, password)) {
			System.out.println("Login is successful");
		}else {
			System.out.println("Login failed.");
		}
				
	}
	
	
	@Override
	public void loginWithGoogle(User user) {
		
	      if(userRepository.loginByCheck(user.geteMail(), user.getPassword())!=false) {
			this.registerWithGoogleService.registerWithGoogle(user);
	      }
	}
	
}
