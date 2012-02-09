package com.training.jee.jpa.test;

import java.sql.Timestamp;

import javax.persistence.EntityTransaction;

import org.junit.Test;

import com.training.jee.jpa.PrivateMessages;
import com.training.jee.jpa.UserInformation;

public class PrivateMessagesTest extends BaseTest{

	private long  messageid = 0 ;
	
	@Test
	public void testCreatePrivateMessages()
	{
		
		UserInformation ui = em.find(UserInformation.class,2l);	
		PrivateMessages pm = new PrivateMessages();
		
		pm.setFromuserinfoid(null);
		pm.setMessagebody("Hi...");
		pm.setMessagedate(new Timestamp(System.currentTimeMillis()));
		pm.setMessageid(null);
		pm.setTouserinfoid(null);
		
				
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(ui);
		et.commit();
	}	



@Test
public void testFindPrivateMessages()	
{
	//PrivateMessages pm = ((em) pm).find(PrivateMessages.class, 05L);
	
}
	
}