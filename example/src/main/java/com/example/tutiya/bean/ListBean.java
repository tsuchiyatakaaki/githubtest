package com.example.tutiya.bean;

import org.hibernate.validator.constraints.NotBlank;

import com.example.tutiya.bean.RegistUpdateForm.Group1;

public class ListBean {

	private Integer teamId;

	@NotBlank(groups=Group1.class, message="{validation.NotBlank}")
	private String teamName;

	private Integer captainId;

	private String name;

	private int version;
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getCaptainId() {
		return captainId;
	}

	public void setCaptainId(Integer captainId) {
		this.captainId = captainId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
