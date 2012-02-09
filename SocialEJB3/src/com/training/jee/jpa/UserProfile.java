package com.training.jee.jpa;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the user_profile database table.
 * 
 */
@Entity
@Table(name="user_profile")
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_PROFILE_ID")
	private BigInteger userProfileId;

	@Column(name="FRIENDS_OF_FRIENDS")
	private boolean friendsOfFriends;

	@Column(name="FRIENDS_ONLY")
	private boolean friendsOnly;

	@Column(name="PUBLIC_ACCESS")
	private boolean publicAccess;

	@Column(name="USER_ID")
	private java.math.BigInteger userId;

	//bi-directional many-to-one association to Friend
	@OneToMany(mappedBy="userProfile", fetch=FetchType.LAZY)
	private Set<Friend> friends;

    public UserProfile() {
    }

	

	
	public java.math.BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(java.math.BigInteger userId) {
		this.userId = userId;
	}

	public Set<Friend> getFriends() {
		return this.friends;
	}

	public void setFriends(Set<Friend> friends) {
		this.friends = friends;
	}

	public boolean isFriendsOfFriends() {
		return friendsOfFriends;
	}

	public void setFriendsOfFriends(boolean friendsOfFriends) {
		this.friendsOfFriends = friendsOfFriends;
	}

	public boolean isFriendsOnly() {
		return friendsOnly;
	}

	public void setFriendsOnly(boolean friendsOnly) {
		this.friendsOnly = friendsOnly;
	}

	public boolean isPublicAccess() {
		return publicAccess;
	}

	public void setPublicAccess(boolean publicAccess) {
		this.publicAccess = publicAccess;
	}
	
}