package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the deposit database table.
 * 
 */
@Entity
@Table(name="deposit")
@JsonFilter("depositFilter")
@NamedQuery(name="Deposit.findAll", query="SELECT d FROM Deposit d")
public class Deposit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="D_ID")
	private Long dId;

	private double amount;

	@Column(name="D_MODE")
	private String dMode;

	@Column(name="GEN_DATE")
	private Timestamp genDate;

	private String status;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="ACCNO")
	private Account account;

	public Deposit() {
	}

	public Long getDId() {
		return this.dId;
	}

	public void setDId(Long dId) {
		this.dId = dId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDMode() {
		return this.dMode;
	}

	public void setDMode(String dMode) {
		this.dMode = dMode;
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

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}