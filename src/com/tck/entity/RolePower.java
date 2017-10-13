package com.tck.entity;

public class RolePower {

	private Integer id;
	private Integer roleid;
	private Integer powerid;
	private String isread;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	
	public Integer getPowerid() {
		return powerid;
	}
	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}
	public String getIsread() {
		return isread;
	}
	public void setIsread(String isread) {
		this.isread = isread;
	}
	@Override
	public String toString() {
		return "RolePower [id=" + id + ", roleid=" + roleid + ", powerid="
				+ powerid + ", isread=" + isread + "]";
	}
	public RolePower(Integer id, Integer roleid, Integer powerid, String isread){
		this.id = id;
		this.roleid = roleid;
		this.powerid = powerid;
		this.isread = isread;
	}
	public RolePower(){
		super();
	}
}
