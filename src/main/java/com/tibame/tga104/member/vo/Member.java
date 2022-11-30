package com.tibame.tga104.member.vo;

import java.sql.Timestamp;

public class Member {

	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private Boolean pass;
	private Timestamp lastUpdateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Boolean getPass() {
		return pass;
	}
	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	

}
