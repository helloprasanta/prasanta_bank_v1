package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the withdraw database table.
 * 
 */
@Entity
@Table(name="withdraw")
@JsonFilter("withdrawFilter")
@NamedQuery(name="Withdraw.findAll", query="SELECT w FROM Withdraw w")
public class Withdraw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="W_ID")
	private Long wId;

	private double amount;

	@Column(name="GEN_DATE")
	private Timestamp genDate;

	private String status;

	@Column(name="W_MODE")
	private String wMode;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="ACCNO")
	private Account account;

	public Withdraw() {
	}

	public Long getWId() {
		return this.wId;
	}

	public void setWId(Long wId) {
		this.wId = wId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getGenDate() {
		return this.genDate;
	}

	public void setGenDate(Timestamp genDate) {
		this.genDate = genDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWMode() {
		return this.wMode;
	}

	public void setWMode(String wMode) {
		this.wMode = wMode;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}