package com.training.jee.ejb;
import javax.ejb.Local;

import com.training.jee.jpa.UserCredential;

@Local
public interface UserManagementBeanLocal {
	 public void createUserCredential(UserCredential uc);
}
