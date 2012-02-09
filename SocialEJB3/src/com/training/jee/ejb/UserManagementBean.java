package com.training.jee.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;

import com.training.jee.jpa.UserCredential;

/**
 * Session Bean implementation class UserManagementBean
 */
@Stateless
//@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UserManagementBean implements UserManagementBeanLocal {
	
	@Resource
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public UserManagementBean() {
        
    }
    
    public void createUserCredential(UserCredential uc)
    {
    	em.persist(uc);
    }

}
