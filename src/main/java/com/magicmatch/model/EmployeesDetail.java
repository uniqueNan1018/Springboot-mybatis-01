package com.magicmatch.model;

public class EmployeesDetail {
	private Integer id;
	private String tel;
	private String email;
	public EmployeesDetail(Integer id, String tel, String email) {
		super();
		this.id = id;
		this.tel = tel;
		this.email = email;
	}
	public EmployeesDetail() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeesDetail [id=" + id + ", tel=" + tel + ", email=" + email + "]";
	}
	
	
}
