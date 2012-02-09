package com.training.jee.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
	protected EntityManager em;
	protected EntityTransaction et;
	
	@Before
	public void setUp() throws Exception {
		if(em ==null)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.training.jee");
			em = emf.createEntityManager();
			et = em.getTransaction();
		}
	}
	
	@After
	public void tearDown() throws Exception {
		if(em!= null)
			em.close();
	}
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
