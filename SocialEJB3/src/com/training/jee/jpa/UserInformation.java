package com.training.jee.jpa;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_information database table.
 * select ui from UserInformation ui
 * join ui.
 */
@Entity
@Table(name="user_information")
public class UserInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_INFORMATION_ID")
	private BigInteger userInformationId;

	@Embedded
	private Address address;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="USER_ID")
	private UserCredential uc;


	//bi-directional many-to-one association to WallPost
	//@OneToMany(mappedBy="userInformation", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<WallPost> wallPosts;
	
	@OneToMany(mappedBy="userInformation", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<PrivateMessages> messages;
	
    public Set<WallPost> getWallPosts() {
		return wallPosts;
	}


	public void setWallPosts(Set<WallPost> wallPosts1) {
		this.wallPosts = wallPosts1;
	}
	


	public void setMessages(Set<PrivateMessages> messages) {
		this.messages = messages;
	}


	public Set<PrivateMessages> getMessages() {
		return messages;
	}


	public UserInformation() {
    }
    
    
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public BigInteger getUserInformationId() {
		return this.userInformationId;
	}

	public void setUserInformationId(BigInteger userInformationId) {
		this.userInformationId = userInformationId;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserCredential getUc() {
		return uc;
	}

	public void setUc(UserCredential uc) {
		this.uc = uc;
	}
}