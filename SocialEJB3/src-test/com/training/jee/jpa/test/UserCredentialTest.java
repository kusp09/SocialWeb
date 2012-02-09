package com.training.jee.jpa.test;


import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Test;

import com.training.jee.jpa.UserCredential;

public class UserCredentialTest extends BaseTest{

	private long userid = 0;
	
	@Test
	public void testCreateUserCredential()
	{
		UserCredential uc = new UserCredential();
		uc.setCreateDate(new Timestamp(System.currentTimeMillis()));
		uc.setLastLoginAt(null);
		uc.setUserName("sudhir12");
		uc.setPassword("giti");
		 EntityTransaction et = em.getTransaction();
		 et.begin();
		 //
		 em.persist(uc);
		 //
		 et.commit();
	
		 System.out.println("after commit: " + uc.getUserId());
	}
	
	@Test
	public void testFindUserCredential()
	{
		UserCredential uc = em.find(UserCredential.class, 05L);
		Assert.assertNotNull(uc);
		System.out.println("Found: " + uc.getUserId() + " : " + uc.getUserName());
	}
	
	@Test
	public void testFindUserCredentialByQuery()
	{
		Query query = em.createQuery("from UserCredential");
		List<UserCredential> usrs = query.getResultList();
		for(UserCredential uc : usrs)
		{
			System.out.println("Found: " + uc.getUserId() + " : " + uc.getUserName());
		}
	}



}
