package com.training.jee.jpa.test;

import static com.training.jee.jpa.test.UserProfileTest.findUserProfile;

import java.sql.Timestamp;

import org.junit.Test;

import com.training.jee.jpa.Friend;
import com.training.jee.jpa.UserProfile;

public class FriendTest extends BaseTest{
	
	@Test
	public void testCreateFriend()
	{
		UserProfile up = findUserProfile(em, 12L);
		UserProfile fup = findUserProfile(em, 13L);
		Friend f = new Friend();
		f.setActive(true);
		f.setAddedDate(new Timestamp(System.currentTimeMillis()));
		f.setUserProfile(up);
		f.setFriendsProfile(fup);
		et.begin();
		em.persist(f);
		et.commit();
		
	}
}
