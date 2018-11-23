package com.vo;

import java.util.Date;

public class Emps {
	private String id;
	private String name;
	private int salary;
	private Date hiredate;
	private int did;
	private String dname;
	
	public Emps() {
	}
	
	public Emps(String id, String name, int salary, int did) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.did = did;
	}
	

	public Emps(String id, String name, int salary, Date hiredate, int did, String dname) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
		this.did = did;
		this.dname = dname;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Emps [id=" + id + ", name=" + name + ", salary=" + salary + ", hiredate=" + hiredate + ", did=" + did
				+ ", dname=" + dname + "]";
	}
	
	
}
