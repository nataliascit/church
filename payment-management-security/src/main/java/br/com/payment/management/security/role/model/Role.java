package br.com.payment.management.security.role.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.payment.management.security.user.model.User;

/**
 * The representation of role associated to an {@link User}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "ROLE")
public class Role {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="ROLE")
	private String role;
	
	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}
}