package com.soprasteria.devops.model;

public class BaseObj {

	private String id;
	
	private String projectName;
	
	private String companyName;
	
	public BaseObj() {
		// TODO Auto-generated constructor stub
	}

	public BaseObj(String id, String projectName, String companyName) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.companyName = companyName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}
