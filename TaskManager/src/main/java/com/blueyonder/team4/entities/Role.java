package com.blueyonder.team4.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="roles")
public class Role {
	@Id
	private Long roleId;
	private String roleName;
}
