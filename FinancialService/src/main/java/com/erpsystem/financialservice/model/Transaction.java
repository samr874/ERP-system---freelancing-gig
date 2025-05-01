package com.erpsystem.financialservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity()
@Table(name = "accounttransactions")

public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	@ManyToOne
	@JoinColumn(name="accountId", nullable=false)
	private FinancialAccount account;
	private String transactionType;
	private Long ampount;
	private String currency;
	private String description;
	public Transaction() {
		super();
	}
	public Transaction(Long transactionId, String transactionType, Long ampount, String currency,
			String description) {
		super();
		this.transactionId = transactionId;
		
		this.transactionType = transactionType;
		this.ampount = ampount;
		this.currency = currency;
		this.description = description;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Long getAmpount() {
		return ampount;
	}
	public void setAmpount(Long ampount) {
		this.ampount = ampount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionType="
				+ transactionType + ", ampount=" + ampount + ", currency=" + currency + ", description=" + description
				+ "]";
	}

	
	

}
