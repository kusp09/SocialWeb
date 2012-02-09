package com.training.jee.jpa.test;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import com.training.jee.jpa.UserProfile;


public class UserProfileTest extends BaseTest{

	@Test
	public void testCreateUserProfile()
	{
		UserProfile up = new UserProfile();
		up.setUserId(BigInteger.valueOf(23l));
		//
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(up);		
		t.commit();
	}
	
	@Test	
	public void testFindUserProfile()
	{
		findUserProfile(em, 12L);
	}
	
	public static UserProfile findUserProfile(EntityManager em, long profileId)
	{
		UserProfile up = em.find(UserProfile.class, BigInteger.valueOf(profileId));
		System.out.println("Number of friends: " + up.getFriends().size());
		return up;
	}
	
}
