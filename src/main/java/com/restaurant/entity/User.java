package com.restaurant.entity;

public class User {
	private int id;
	private String name;
	private String userCreatedDate;
	private String userCreatedBy;
	
	public User()
	{
		
	}
	
	public User( String name, String userCreatedBy, String userCreatedDate)
	{

		this.name=name;
		this.userCreatedBy=userCreatedBy;
		this.userCreatedDate=userCreatedDate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(String userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	public String getUserCreatedBy() {
		return userCreatedBy;
	}

	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}

	
	

}
