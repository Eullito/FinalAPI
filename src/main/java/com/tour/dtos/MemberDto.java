package com.tour.dtos;

import org.apache.ibatis.type.Alias;

@Alias(value = "memberDto")
public class MemberDto {

	private int userId;
	private String id;
	private String name;
	private String password;
	private String email;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int userId, String id, String name, String password, String email) {
		super();
		this.userId = userId;
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public int getMemberId() {
		return userId;
	}

	public void setMemberId(int memberId) {
		this.userId = memberId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + userId + ", id=" + id + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}
	
}
