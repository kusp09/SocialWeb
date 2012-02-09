package com.training.jee.jpa.test;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import junit.framework.Assert;

import org.junit.Test;

import com.training.jee.jpa.UserInformation;
import com.training.jee.jpa.WallPost;

/**
 * Entity implementation class for Entity: WallPostsTest
 *
 */


public class WallPostTest extends BaseTest {
	private long postid = 0;
	
	@Test
	public void testCreateWallPost()
	{
		
		UserInformation ui = em.find(UserInformation.class,2l);	
		WallPost wp = new WallPost();
		
		wp.setPostdt(new Timestamp(System.currentTimeMillis()));
		wp.setPostmessage("Hi this is Madhu");
		wp.setPostuserinfoid(null);
		wp.setWalluserinfoid(null);
		
		EntityTransaction et = em.getTransaction();
		//
		et.begin();
		em.persist(ui);
		et.commit();
	}
	
	@Test
	public void testFindWallPost()	
	{
		WallPost wp = em.find(WallPost.class,new BigInteger("1"));
		Assert.assertNotNull(wp);
		System.out.println("Found: "+wp.getPostdt() + wp.getPostmessage() + " : " + wp.getPostuserinfoid()+ " : " + wp.getWalluserinfoid());
		//TODO
	}
	
	

	@Test
	public void testFindWallPostByQuery()	
	{
		Query query = em.createQuery("from WallPost");
		List<WallPost> usrs = query.getResultList();
		for(WallPost wp : usrs )
		{
			System.out.println("Found: "+wp.getPostdt() + wp.getPostmessage() + " : " + wp.getPostuserinfoid()+ " : " + wp.getWalluserinfoid());
		}
		//TODO
	}
	
	
	
   
}
