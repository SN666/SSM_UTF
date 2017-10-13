package com.tck.entity;

import java.util.Date;

public class User {
	
    private Integer userid;
    private String username;
    private String password;
    private Date createtime;
    private String phone;
    
    public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", createtime="+createtime+", phone="+phone+"]";
    }
    public User(Integer userid, String username, String password, Date createtime, String phone) {
        super();
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.createtime =createtime;
        this.phone = phone;
    }
    public User() {
        super();
    }
    
}
