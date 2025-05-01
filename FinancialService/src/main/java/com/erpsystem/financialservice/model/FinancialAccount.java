package com.erpsystem.financialservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "financialaccount")
public class FinancialAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	 private long userId;
	 private String accountType;
	 private String currency;
	 private BigDecimal balance;
	 private LocalDate creationDate;
	  @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Transaction>transactions;
	 
	public FinancialAccount() {
		super();
	}
	public FinancialAccount(long accountId, long userId, String accountType, String currency, BigDecimal balance,
			LocalDate creationDate) {
		super();
		this.accountId = accountId;
		this.userId = userId;
		this.accountType = accountType;
		this.currency = currency;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "FinancialAccount [accountId=" + accountId + ", userId=" + userId + ", accountType=" + accountType
				+ ", currency=" + currency + ", balance=" + balance + ", creationDate=" + creationDate + "]";
	}
	 
	

}
