package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the transfer database table.
 * 
 */
@Entity
@Table(name="transfer")
@JsonFilter("transferFilter")
@NamedQuery(name="Transfer.findAll", query="SELECT t FROM Transfer t")
public class Transfer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="T_ID")
	private Long tId;

	private double amount;

	@Column(name="GEN_DATE")
	private Timestamp genDate;

	private String status;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="D_ACCNO")
	private Account account1;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="S_ACCNO")
	private Account account2;

	public Transfer() {
	}

	public Long getTId() {
		return this.tId;
	}

	public void setTId(Long tId) {
		this.tId = tId;
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

	public Account getAccount1() {
		return this.account1;
	}

	public void setAccount1(Account account1) {
		this.account1 = account1;
	}

	public Account getAccount2() {
		return this.account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}

}