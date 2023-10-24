package com.magicmatch.model;

public class EmployeesBasic {
	private Integer id;
	private String name;
	private Integer gender;
	private Integer age;
	private Boolean isJapanese;
	public EmployeesBasic(Integer id, String name, Integer gender, Integer age, Boolean isJapanese) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isJapanese = isJapanese;
	}
	public EmployeesBasic() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsJapanese() {
		return isJapanese;
	}
	public void setIsJapanese(Boolean isJapanese) {
		this.isJapanese = isJapanese;
	}
	@Override
	public String toString() {
		return "EmployeesBasic [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", isJapanese="
				+ isJapanese + "]";
	}
	
	
}
