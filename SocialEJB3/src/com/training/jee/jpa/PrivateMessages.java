package com.training.jee.jpa;

import java.io.Serializable; 
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Messages
 *
 */
@Entity
@Table(name="private_messages")
public class PrivateMessages implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MESSAGE_ID")
	private BigInteger messageid;

	@Column(name="MESSAGE_DATE", nullable=false)
	private Timestamp messagedate;

	@Column(name="MESSAGE_BODY", nullable=true)
	private String messagebody;

	@Column(name="FROM_USER_INFO_ID", nullable=false)
	private BigInteger  fromuserinfoid;

	@Column(name="TO_USER_INFO_ID", nullable=false)
	private BigInteger  touserinfoid;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_INFORMATION_ID")
	private UserInformation userInformation;

	public PrivateMessages() {
		super();
	}
	

	public BigInteger getMessageid() {
		return messageid;
	}



	public void setMessageid(BigInteger messageid) {
		this.messageid = messageid;
	}



	public Timestamp getMessagedate() {
		return messagedate;
	}



	public void setMessagedate(Timestamp messagedate) {
		this.messagedate = messagedate;
	}



	public String getMessagebody() {
		return messagebody;
	}



	public void setMessagebody(String messagebody) {
		this.messagebody = messagebody;
	}



	public BigInteger getFromuserinfoid() {
		return fromuserinfoid;
	}



	public void setFromuserinfoid(BigInteger fromuserinfoid) {
		this.fromuserinfoid = fromuserinfoid;
	}



	public BigInteger getTouserinfoid() {
		return touserinfoid;
	}



	public void setTouserinfoid(BigInteger touserinfoid) {
		this.touserinfoid = touserinfoid;
	}



	
   
}
