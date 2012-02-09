package com.training.jee.jpa.test;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Test;

import com.training.jee.jpa.Address;
import com.training.jee.jpa.UserCredential;
import com.training.jee.jpa.UserInformation;



public class UserInformationTest extends BaseTest{

	@Test
	public void testCreateUserInformation()
	{
		
		UserCredential uc = em.find(UserCredential.class, 04l);	
		EntityTransaction et = em.getTransaction();
		//
		UserInformation ui = new UserInformation();
		ui.setUc(uc);
	
	//	ui.setUserName("sudhir");
		ui.setFirstName("mani");
		ui.setLastName("kk");
		Address a = new Address();
		a.setAddress1("dafsdfdsf");
		a.setAddress2(null);
		a.setCity("Atlanta");
		a.setZip(30005);
		ui.setAddress(a);
		ui.setEmail("sudhir@jee.com");
		//
		et.begin();
		em.persist(ui);
		et.commit();
	}
	
	//exercidse write a finder for userinformation
	
	@Test
	public void testFindUserInformation()	
	{
		UserInformation ui = em.find(UserInformation.class, new BigInteger("04"));
		Assert.assertNotNull(ui);
		System.out.println("Found: " + ui.getFirstName() + " : " + ui.getLastName() +" " + ui.getEmail()  + " : " + ui.getAddress());
		
		
	}
	
	

	@Test
	public void testFindUserInformationByQuery()	
	{
		Query query = em.createQuery("from UserInformation");
		List<UserInformation> usrs = query.getResultList();
		for(UserInformation ui : usrs)
		{
			System.out.println("Found: " + ui.getFirstName() + " : " + ui.getLastName() +" " + ui.getEmail()  + " : " + ui.getAddress());
		}
	}

}
