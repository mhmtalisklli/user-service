package eba.rich.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eba.rich.user.dto.UserDto;
import eba.rich.user.entity.User;
import eba.rich.user.repository.UserRepository;

@Service
public class UserService {
	
	
	
	 @Autowired
	    private UserRepository userRepository;
	   
	 
	 @Autowired
	    PasswordEncoder encoder;
	 
	 
	    @Transactional
	    public void addUser(UserDto userDto) {
	    	
	 
	    	    User user = userDto.toEntity();
	    
		    	user.setPassword(encoder.encode(userDto.getPassword()));
	  
	    	userRepository.save(user);


	    }

}
