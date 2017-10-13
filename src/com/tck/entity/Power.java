package com.tck.entity;

import java.util.Date;

public class Power {
	
    private Integer powerid;
    private Integer fatherid;
    private String powername;
    private String powerurl;
    private String powerparam;
    private Date addtime;
    private String powericon;
    
	public Integer getPowerid() {
		return powerid;
	}
	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}
	public Integer getFatherid() {
		return fatherid;
	}
	public void setFatherid(Integer fatherid) {
		this.fatherid = fatherid;
	}
	public String getPowername() {
		return powername;
	}
	public void setPowername(String powername) {
		this.powername = powername;
	}
	public String getPowerurl() {
		return powerurl;
	}
	public void setPowerurl(String powerurl) {
		this.powerurl = powerurl;
	}
	public String getPowerparam() {
		return powerparam;
	}
	public void setPowerparam(String powerparam) {
		this.powerparam = powerparam;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	public String getPowericon() {
		return powericon;
	}
	public void setPowericon(String powericon) {
		this.powericon = powericon;
	}
	@Override
	public String toString() {
		return "Power [powerid=" + powerid + ", fatherid=" + fatherid
				+ ", powername=" + powername + ", powerurl=" + powerurl
				+ ", powerparam=" + powerparam + ", addtime=" + addtime + ", powericon=" + powericon+"]";
	}
    public Power(Integer powerid, Integer fatherid, String powername, String powerurl, String powerparam, Date addtime, String powericon) {
        super();
        this.powerid = powerid;
        this.fatherid = fatherid;
        this.powername = powername;
        this.powerurl =powerurl;
        this.powerparam = powerparam;
        this.addtime = addtime;
        this.powericon = powericon;
    }
    public Power() {
        super();
    }
    
}
