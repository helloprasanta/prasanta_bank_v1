package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the manager database table.
 * 
 */
@Entity
@Table(name="manager")
@JsonFilter("managerFilter")
@NamedQuery(name="Manager.findAll", query="SELECT m FROM Manager m")
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="M_ID")
	private Long mId;

	private Timestamp gendate;

	@Column(name="M_EMAIL")
	private String mEmail;

	@Column(name="M_NAME")
	private String mName;

	@Column(name="M_PASSWORD")
	private String mPassword;

	private String status;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="BR_ID")
	private Branch branch;

	public Manager() {
	}

	public Long getMId() {
		return this.mId;
	}

	public void setMId(Long mId) {
		this.mId = mId;
	}

	public Timestamp getGendate() {
		return this.gendate;
	}

	public void setGendate(Timestamp gendate) {
		this.gendate = gendate;
	}

	public String getMEmail() {
		return this.mEmail;
	}

	public void setMEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public String getMName() {
		return this.mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}

	public String getMPassword() {
		return this.mPassword;
	}

	public void setMPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}