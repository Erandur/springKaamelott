package com.springRestAngular.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="kaamelott")
@Table(name="kaamelott")
public class Kaamelott {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="prenom")
	private String prenom;
	@Column(name="role")
	private String role;
	
	public Kaamelott() {
		super();
	}
	
	public Kaamelott(Long id, String prenom, String role) {
		this.id = id;
		this.prenom = prenom;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getRole() {
		return role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
