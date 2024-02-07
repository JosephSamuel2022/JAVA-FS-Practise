package com.blueyonder.team4.payloads;

import java.util.HashSet;
import java.util.Set;
import com.blueyonder.team4.entities.Role;

import lombok.Data;

@Data
public class UserDTO {
	private Long userId;
	private String name;
	private String mobileNumber;
	private String email;
	private String password;
	
	private Set<Role> roles=new HashSet<>();

	
}
	
