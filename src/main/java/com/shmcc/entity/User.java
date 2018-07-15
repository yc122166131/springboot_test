package com.shmcc.entity;

import java.io.Serializable;

public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3343461856604583418L;
	
	private Long id ;
	private String userName;
	private Long age;
	private Long transId;

	public User(Long id, String userName, Long age, Long transId) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.transId = transId;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Long getAge() {
		return age;
	}



	public void setAge(Long age) {
		this.age = age;
	}



	public Long getTransId() {
		return transId;
	}



	public void setTransId(Long transId) {
		this.transId = transId;
	}



	public User() {
		super();
	}
	
	
	
	
	
}
