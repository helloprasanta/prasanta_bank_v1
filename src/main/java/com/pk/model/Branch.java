package com.pk.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the branch database table.
 * 
 */
@Entity
@Table(name="branch")
@JsonFilter("branchFilter")
@NamedQuery(name="Branch.findAll", query="SELECT b FROM Branch b")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BR_ID")
	private Long brId;

	@Column(name="BR_ADDRESS")
	private String brAddress;

	@Column(name = "BR_NAME")
	private String brName;

	@Column(name = "BR_NO")
	private BigInteger brNo;

	@Column(name = "GEN_DATE")
	private Timestamp genDate;

	@Column(name = "STATUS")
	private String status;

	//bi-directional many-to-one association to Manager
	@OneToMany(mappedBy = "branch")
	private List<Manager> managers;

	public Branch() {
	}

	public Long getBrId() {
		return this.brId;
	}

	public void setBrId(Long brId) {
		this.brId = brId;
	}

	public String getBrAddress() {
		return this.brAddress;
	}

	public void setBrAddress(String brAddress) {
		this.brAddress = brAddress;
	}

	public String getBrName() {
		return this.brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public BigInteger getBrNo() {
		return this.brNo;
	}

	public void setBrNo(BigInteger brNo) {
		this.brNo = brNo;
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

	public List<Manager> getManagers() {
		return this.managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public Manager addManager(Manager manager) {
		getManagers().add(manager);
		manager.setBranch(this);

		return manager;
	}

	public Manager removeManager(Manager manager) {
		getManagers().remove(manager);
		manager.setBranch(null);

		return manager;
	}

}