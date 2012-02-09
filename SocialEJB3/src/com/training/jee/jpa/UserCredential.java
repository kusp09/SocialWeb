package com.training.jee.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_credential database table.
 * 
 */
@Entity
@Table(name="user_credential")



public class UserCredential extends BaseUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_DATE", nullable=false)
	private Timestamp createDate;

	@Column(name="LAST_LOGIN_AT", nullable=true)
	private Timestamp lastLoginAt;

	@Column(name="PASSWORD", nullable=false, length=100)
	private String password;
	
	
	


    public UserCredential() {
    }

	
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getLastLoginAt() {
		return this.lastLoginAt;
	}

	public void setLastLoginAt(Timestamp lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}