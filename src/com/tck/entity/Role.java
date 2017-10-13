package com.tck.entity;

import java.util.Date;

public class Role {
	private Integer roleid;
	private String roletype;
	private String rolename;
	private String remarks;
	private Date addtime;
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", roletype=" + roletype
				+ ", rolename=" + rolename + ", remarks=" + remarks
				+ ", addtime=" + addtime + "]";
	}
	public Role(Integer roleid, String roletype, String rolename, String remarks, Date addtime){
		this.roleid = roleid;
		this.roletype = roletype;
		this.rolename = rolename;
		this.remarks = remarks;
		this.addtime = addtime;
		
	}
	public Role(){
		super();
	}

}
