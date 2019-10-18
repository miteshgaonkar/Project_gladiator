package com.lti.finance.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMICARD")
public class EmiCard {
	

	@Id
	@GeneratedValue
	@Column(name="CARD_NO")
	private int cardNo;
	
	@Column(name="CARD_TYPE")
	private Type cardType;
	
	@Column(name="CARD_LIMIT")
	private double cardLimit;
	
	@Column(name="ACTIVATION_DATE")
	private LocalDate activationDate;
	
	@Column(name="EXPIRY_DATE")
	private LocalDate expiryDate;
	
	@Column(name="CREDIT_USED")
	private double creditUsed;
	
	@Column(name="CARD_STATUS")
	private Status cardstatus;
	
	@OneToOne 
	private User user;
	
	public static enum Type{
		Titatium,Gold
	}
	
	public static enum Status{
		Active,NotActive
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public Type getCardType() {
		return cardType;
	}

	public void setCardType(Type cardType) {
		this.cardType = cardType;
	}

	public double getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}

	public LocalDate getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getCreditUsed() {
		return creditUsed;
	}

	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}

	public Status getCardstatus() {
		return cardstatus;
	}

	public void setCardstatus(Status cardstatus) {
		this.cardstatus = cardstatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
