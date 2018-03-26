package com.moting.boot.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "department")
public class Department  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long did;
	@NotNull
	private String deptName;
	private String deptDesc;
	public Department(long did, @NotNull String deptName, String deptDesc) {
		super();
		this.did = did;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
	public Department() {
		super();
	}
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
