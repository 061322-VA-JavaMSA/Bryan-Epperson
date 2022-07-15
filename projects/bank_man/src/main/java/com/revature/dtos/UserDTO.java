package com.revature.dtos;

import java.util.Objects;

import com.revature.models.Role;
import com.revature.models.User;

/*-
 * Data Transfer Objects
 */
public class UserDTO {

	private int id;
	private String username;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private Role role;
	
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(User u) {
		id = u.getId();
		username = u.getUsername();
		userFirstName = u.getUserFirstName();
		userLastName = u.getUserLastName();
		userEmail = u.getUserEmail();
		role = u.getRole();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, role, userEmail, userFirstName, userLastName, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return id == other.id && role == other.role && Objects.equals(userEmail, other.userEmail)
				&& Objects.equals(userFirstName, other.userFirstName)
				&& Objects.equals(userLastName, other.userLastName) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", role=" + role + "]";
	}
}
