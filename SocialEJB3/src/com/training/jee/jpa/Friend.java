package com.training.jee.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the friends database table.
 * 
 */
@Entity
@Table(name="friends")
public class Friend implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REL_ID")
	private long relId;

	@Column(name="ACTIVE")
	private boolean active;

	@Column(name="ADDED_DATE")
	private Timestamp addedDate;

	//bi-directional many-to-one association to UserProfile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_PROFILE_ID")
	private UserProfile userProfile;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FRIEND_USER_PROFILE_ID")
	private UserProfile friendsProfile;

	public Friend() {
    }

	public long getRelId() {
		return relId;
	}

	public void setRelId(long relId) {
		this.relId = relId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
    public UserProfile getFriendsProfile() {
		return friendsProfile;
	}

	public void setFriendsProfile(UserProfile friendsProfile) {
		this.friendsProfile = friendsProfile;
	}


}