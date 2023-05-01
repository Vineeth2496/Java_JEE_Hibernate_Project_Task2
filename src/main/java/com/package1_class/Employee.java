package com.package1_class;



public class Employee
{
	
	private Integer id;
	private String name;
	private Float sal;
	private String dept;
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
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	

}
