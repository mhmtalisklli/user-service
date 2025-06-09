package eba.rich.user.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import eba.rich.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
	
	
    private String name;
	

    private String surName;
    

    private String tckn;
	
    private String password;
    

    
    
    public User toEntity() {
    	
    	User user = new User();
    	
    	user.setName(getName());
    	user.setSurName(getSurName());
    	user.setTckn(getTckn());
    	
    	//username olarak Tc kullanılacak
    	user.setUsername(getTckn());
    	
    	return user;
    	
    }
    
}