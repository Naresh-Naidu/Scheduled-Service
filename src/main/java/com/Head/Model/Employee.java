package com.Head.Model;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer deptid;
	private Integer addressid;
	
	
	
	public Employee(Integer id, String name, Integer deptid, Integer addressid) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.addressid = addressid;
	}
	
	public Employee() {
		
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
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public Integer getAddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	
	
	
}
