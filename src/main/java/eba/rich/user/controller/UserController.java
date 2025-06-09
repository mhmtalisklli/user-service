package eba.rich.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eba.rich.user.dto.UserDto;
import eba.rich.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	

    @GetMapping("/users/me")
    public void getCurrentUser(@AuthenticationPrincipal Jwt jwt) {
      System.out.println("asdasda");
    }
    
    

	   @PostMapping("/add-user")
	    public  void addUser( @RequestBody UserDto user) {
		  
		
		    userService.addUser(user);

	        
	    }
	   
}
