package com.training.jee.jpa;

import java.io.Serializable; 
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the user_information database table.
 * 
 */


@Entity
@Table(name="wall_posts")

public class WallPost implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="POST_ID")
private BigInteger postid;

@Column(name="POST_DT", nullable=false)
private Timestamp postdt;

@Column(name="POST_MSG", nullable=true)
private String postmessage;

@Column(name="WALL_USER_INFO_ID", nullable=false)
private BigInteger  walluserinfoid;

@Column(name="POST_USER_INFO_ID", nullable=false)
private BigInteger  postuserinfoid;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="USER_INFORMATION_ID")
private UserInformation ui;

public WallPost() {
	
}

	public BigInteger getPostid() {
	return postid;
}

public void setPostid(BigInteger postid) {
	this.postid = postid;
}

public Timestamp getPostdt() {
	return postdt;
}

public void setPostdt(Timestamp postdt) {
	this.postdt = postdt;
}

public String getPostmessage() {
	return postmessage;
}

public void setPostmessage(String postmessage) {
	this.postmessage = postmessage;
}

public BigInteger getWalluserinfoid() {
	return walluserinfoid;
}

public void setWalluserinfoid(BigInteger walluserinfoid) {
	this.walluserinfoid = walluserinfoid;
}

public BigInteger getPostuserinfoid() {
	return postuserinfoid;
}

public void setPostuserinfoid(BigInteger postuserinfoid) {
	this.postuserinfoid = postuserinfoid;
}

	
   
	
	
	
}
