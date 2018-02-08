package br.com.payment.management.security.user.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.payment.management.security.role.model.Role;

/**
 * The representation of a user responsible for executing actions over an application.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ACTIVE")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLE",
			joinColumns = @JoinColumn(name = "ID_USER"),
			inverseJoinColumns = @JoinColumn(name = "ID_ROLE")
	)
	private List<Role> roles;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(final int active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(final List<Role> roles) {
		this.roles = roles;
	}
}
