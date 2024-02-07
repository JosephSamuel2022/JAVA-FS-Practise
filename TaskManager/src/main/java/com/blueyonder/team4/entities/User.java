package com.blueyonder.team4.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import com.blueyonder.team4.entities.Role;
@Entity
@Data 
@Table(name="users")

public class User{
	@Id
	private Long userId;
	private String Name ;
	private String mobileNumber;
	private String email;
	private String password;
	private Set<Role> roles=new HashSet<>();
//	private List<Address> address=new ArrayList<>();
//	private Cart cart;
}
