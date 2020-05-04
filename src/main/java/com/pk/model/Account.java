package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name="account")
@JsonFilter("accountFilter")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accno;

	@Column(name="ACC_TYPE")
	private String accType;

	private double balance;

	@Column(name="GEN_DATE")
	private Timestamp genDate;

	private String status;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="CUST_ID")
	private Customer customer;

	//bi-directional many-to-one association to Deposit
	@OneToMany(mappedBy="account")
	private List<Deposit> deposits;

	//bi-directional many-to-one association to Transfer
	@OneToMany(mappedBy="account1")
	private List<Transfer> transfers1;

	//bi-directional many-to-one association to Transfer
	@OneToMany(mappedBy="account2")
	private List<Transfer> transfers2;

	//bi-directional many-to-one association to Withdraw
	@OneToMany(mappedBy="account")
	private List<Withdraw> withdraws;

	public Account() {
	}

	public Long getAccno() {
		return this.accno;
	}

	public void setAccno(Long accno) {
		this.accno = accno;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Deposit> getDeposits() {
		return this.deposits;
	}

	public void setDeposits(List<Deposit> deposits) {
		this.deposits = deposits;
	}

	public Deposit addDeposit(Deposit deposit) {
		getDeposits().add(deposit);
		deposit.setAccount(this);

		return deposit;
	}

	public Deposit removeDeposit(Deposit deposit) {
		getDeposits().remove(deposit);
		deposit.setAccount(null);

		return deposit;
	}

	public List<Transfer> getTransfers1() {
		return this.transfers1;
	}

	public void setTransfers1(List<Transfer> transfers1) {
		this.transfers1 = transfers1;
	}

	public Transfer addTransfers1(Transfer transfers1) {
		getTransfers1().add(transfers1);
		transfers1.setAccount1(this);

		return transfers1;
	}

	public Transfer removeTransfers1(Transfer transfers1) {
		getTransfers1().remove(transfers1);
		transfers1.setAccount1(null);

		return transfers1;
	}

	public List<Transfer> getTransfers2() {
		return this.transfers2;
	}

	public void setTransfers2(List<Transfer> transfers2) {
		this.transfers2 = transfers2;
	}

	public Transfer addTransfers2(Transfer transfers2) {
		getTransfers2().add(transfers2);
		transfers2.setAccount2(this);

		return transfers2;
	}

	public Transfer removeTransfers2(Transfer transfers2) {
		getTransfers2().remove(transfers2);
		transfers2.setAccount2(null);

		return transfers2;
	}

	public List<Withdraw> getWithdraws() {
		return this.withdraws;
	}

	public void setWithdraws(List<Withdraw> withdraws) {
		this.withdraws = withdraws;
	}

	public Withdraw addWithdraw(Withdraw withdraw) {
		getWithdraws().add(withdraw);
		withdraw.setAccount(this);

		return withdraw;
	}

	public Withdraw removeWithdraw(Withdraw withdraw) {
		getWithdraws().remove(withdraw);
		withdraw.setAccount(null);

		return withdraw;
	}

}