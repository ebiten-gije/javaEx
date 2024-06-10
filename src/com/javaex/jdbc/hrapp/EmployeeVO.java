package com.javaex.jdbc.hrapp;

import java.util.Date;

public class EmployeeVO {

	private String name;
	private String eMail;
	private String ph;
	private Date hd;
	
	private int salary;
	
	public EmployeeVO() {
		
	}

	public EmployeeVO(String name, String eMail, String ph, Date hd) {
		super();
		this.name = name;
		this.eMail = eMail;
		this.ph = ph;
		this.hd = hd;
	}

	public EmployeeVO(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public Date getHd() {
		return hd;
	}

	public void setHd(Date hd) {
		this.hd = hd;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeVO [name=" + name + ", eMail=" + eMail + ", ph=" + ph + ", hd=" + hd + ", salary=" + salary
				+ "]";
	}
	
	
}
